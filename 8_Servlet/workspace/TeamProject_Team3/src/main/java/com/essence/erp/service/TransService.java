package com.essence.erp.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.essence.erp.dao.AccountDAO;
import com.essence.erp.dao.PatientDAO;
import com.essence.erp.dao.ReceptionDAO;
import com.essence.erp.dao.StockDAO;
import com.essence.erp.dto.AccountDTO;
import com.essence.erp.dto.HospitalMemberDto;
import com.essence.erp.dto.InvoiceDTO;
import com.essence.erp.dto.PatientDTO;
import com.essence.erp.dto.PaymentDTO;
import com.essence.erp.dto.Prescription_dateDTO;
import com.essence.erp.dto.ReceptionDTO;
import com.essence.erp.dto.TreatmentDTO;
import com.essence.erp.dto.Treatment_dateDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransService {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	ObjectMapper mapper;

	@Transactional
	public String reservationAdd(HttpServletRequest request, ReceptionDTO dto) throws Exception {

		dto.setRes_date(request.getParameter("res_date"));
		dto.setRes_time(request.getParameter("res_time"));

		ReceptionDAO dao = sqlSession.getMapper(ReceptionDAO.class);
		dao.reservationAdd(dto);

		return "redirect:reservationList";
	}

	@Transactional
	public String reservationAddP(HttpServletRequest request, ReceptionDTO dto) throws Exception {

		dto.setRes_date(request.getParameter("res_date"));
		dto.setRes_time(request.getParameter("res_time"));

		ReceptionDAO dao = sqlSession.getMapper(ReceptionDAO.class);
		dao.reservationAdd(dto);

		return "redirect:reservationPatient?c_no=" + dto.getC_no() + "&c_name=" + dto.getC_name();
	}

	@Transactional
	public String stockAdd(HttpServletRequest request, InvoiceDTO dto, AccountDTO a_dto) throws Exception {

		dto.setIn_date(request.getParameter("in_date"));

		StockDAO dao = sqlSession.getMapper(StockDAO.class);

		int ck = dao.check(dto);

		if (ck != 1)
			dao.stockAdd(dto);
		else
			dao.qtyAdd(dto);

		dao.invoiceAdd(dto);

		// ?????? ??????
		String cont = request.getParameter("st_man") + " / " + request.getParameter("st_model");
		int total = Integer.parseInt(request.getParameter("st_qty"))
				* Integer.parseInt(request.getParameter("in_price"));

		a_dto.setAc_date(request.getParameter("in_date"));
		a_dto.setAc_typename(request.getParameter("type_name"));
		a_dto.setAc_cont(cont);
		a_dto.setAc_exp(total);

		AccountDAO a_dao = sqlSession.getMapper(AccountDAO.class);
		a_dao.write(a_dto);

		return "redirect:invoiceList";
	}

	@Transactional
	public String invoiceModify(HttpServletRequest request, InvoiceDTO dto, AccountDTO a_dto) throws Exception {
		
		String in_date = request.getParameter("in_date");
		String in_date_org = request.getParameter("in_date_org");

		int st_qty = Integer.parseInt(request.getParameter("st_qty"));
		int st_qty_org = Integer.parseInt(request.getParameter("st_qty_org"));

		StockDAO dao = sqlSession.getMapper(StockDAO.class);

		dto.setIn_date(in_date);
		dao.invoiceModify(dto);

		int org = dao.stockQty(dto);
		int temp = org - st_qty_org + st_qty;

		dto.setSt_qty(temp);
		dao.stockModify(dto);

		// ?????? ??????
		String cont = request.getParameter("st_man") + " / " + request.getParameter("st_model");
		int total = Integer.parseInt(request.getParameter("st_qty"))
				* Integer.parseInt(request.getParameter("in_price"));

		a_dto.setAc_date(in_date_org);
		a_dto.setAc_typename("?????????");
		a_dto.setAc_cont(cont);
		a_dto.setAc_exp(total);

		AccountDAO a_dao = sqlSession.getMapper(AccountDAO.class);

		a_dto.setAc_seq(Integer.parseInt(a_dao.ac_seq(a_dto)));
		a_dto.setAc_date(in_date);
		
		a_dao.modify(a_dto);

		return "redirect:invoiceList";
	}
	
	@Transactional
	public String patientView(HttpServletRequest request, Model model, PatientDTO p_dto, Treatment_dateDTO td_dto,
			Prescription_dateDTO pd_dto,HospitalMemberDto hm_dto) throws Exception {

		PatientDAO dao = sqlSession.getMapper(PatientDAO.class);
		
		String c_no = request.getParameter("c_no");
		String t_date = request.getParameter("t_date");

		p_dto.setC_no(c_no);
		td_dto.setC_no(c_no);

		model.addAttribute("customer_view", dao.patientView(p_dto));
		model.addAttribute("doctor", dao.doctorList());
		
		// ?????? ???????????? ?????? ???????????? ?????? ??????
		model.addAttribute("date", dao.tredate(c_no));
		
		if (request.getParameter("t_date").equals("")) {
			
		} else {
			
			td_dto.setPatient_treatment_no(request.getParameter("patient_treatment_no"));
			td_dto.setT_date(t_date);
			td_dto.setC_no(c_no);
			
			pd_dto.setPatient_prescription_no(request.getParameter("patient_treatment_no"));
			pd_dto.setT_date(t_date);
			pd_dto.setC_no(c_no);

			model.addAttribute("treatment_date", dao.TreatmentDate(td_dto));
			model.addAttribute("prescription_date", dao.PrescriptionDate(pd_dto));
		}

		return "patient.patientView";
	}
	
	@Transactional
	public String treatmentAdd(HttpServletRequest request, TreatmentDTO t_dto, PatientDTO p_dto, PaymentDTO pay)
			throws Exception {

		PatientDAO dao = sqlSession.getMapper(PatientDAO.class);

		String c_no = request.getParameter("c_no");
		
		// ?????? ????????? ??????
		ReceptionDAO rdao = sqlSession.getMapper(ReceptionDAO.class);
		String r_no = rdao.receptionNo(c_no) + "";

		String str = request.getParameter("treatment_send_list");
		String str2 = request.getParameter("prescription_send_list");

		List<HashMap<String, Object>> list = mapper.readValue(str, List.class);
		List<HashMap<String, Object>> list2 = mapper.readValue(str2, List.class);

		for (int i = 0; i < list.size(); i++) {

			HashMap<String, Object> row = list.get(i);

			String t_code = (String) row.get("code");
			String content = (String) row.get("content");

			dao.treatmentAdd(r_no, c_no, t_code, content);
		}
		for (int i = 0; i < list2.size(); i++) {

			HashMap<String, Object> row2 = list2.get(i);

			String pre_name = (String) row2.get("name2");
			String pre_code = (String) row2.get("code2");

			dao.prescriptionAdd(r_no, c_no, pre_code, pre_name);
		}

		// ?????? ????????? ?????? : ??????, ?????? ?????? ????????? ?????? ???????????? ??????
		rdao.receptionDelete(r_no);

		// & ?????? ?????? ???????????? ????????? ??????
		pay.setC_no(c_no);
		pay.setC_name(rdao.checkName(c_no));
		pay.setT_pay(dao.calcPay(c_no));
		
		rdao.inputPay(pay);

		return "redirect:patientView?t_date=&c_no=" + c_no;
	}

}
