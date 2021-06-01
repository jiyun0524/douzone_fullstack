package kr.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderCommand { // ~DAO
	
	@Autowired
	private List<OrderItem> orderitem;
	
	public void setOrderitem(List<OrderItem> orderitem) {
		this.orderitem = orderitem;
	}

	public List<OrderItem> getOrderitem() {
		return orderitem;
	}
	
	/* 
	 * 총 주문이 3건 있는 경우 만들어지는 데이터 
	 * orderitem[0].itemid
	 * orderitem[0].number
	 * orderitem[0].remark
	 * 
	 * orderitem[1].itemid
	 * orderitem[1].number
	 * orderitem[1].remark
	 * 
	 * orderitem[2].itemid
	 * orderitem[2].number
	 * orderitem[2].remark
	 */
}
