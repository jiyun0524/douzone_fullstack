package guest.service;

import guest.model.Message;
import guest.model.MessageDao;
import guest.model.MessageException;

import java.util.List;

public class ListMessageService {

	//-------------------------------------------------------------------
	// int totalRecCount;		// 전체 레코드 수	
	private int pageTotalCount;		// 전체 페이지 수
	private int countPerPage = 3;	// 한페이지당 레코드 수
	
	private static ListMessageService instance;
	
	public static ListMessageService	getInstance() throws MessageException
	{
		if( instance == null )
		{
			instance = new ListMessageService();
		}
		return instance;
	}
	
	private ListMessageService()
	{
		
	}
	
	public List <Message> getMessageList() throws MessageException
	{
		// 전체 레코드를 검색해 온다면
		 List <Message> mList = MessageDao.getInstance().selectList();			
		return mList;
	}
	
	//------------------------------------------------------------
	// 전체 메세지 레코드 수 얻어오기
	public int getTotalCount() throws MessageException
	{
		// 데이타베이스에서 실제 레코드 수를 검색
		int totalRecCount = MessageDao.getInstance().getTotalCount();
		// 전체 페이지 수
		pageTotalCount = totalRecCount / countPerPage;
		if( totalRecCount % countPerPage > 0  ) pageTotalCount++;
		
		return pageTotalCount;
	}

	//-------------------------------------------------------------
	// 현재 페이지 번호에 의해
	public List <Message> getMessageList(  int pageNum ) throws MessageException
	{
		
		int firstRow = ( pageNum - 1 ) * countPerPage + 1;	// 현재 페이지에서 보여줄 시작 레코드 번호 
		int endRow = pageNum * countPerPage;				// 현재 페이지에서 보여줄 마지막 레코드 번호
		
		// 페이지 번호에 의해 시작 레코드번호와 마지막 레코드번호 구하기
		List <Message> mList = MessageDao.getInstance().selectList(firstRow, endRow);	
		
		return mList;
	}
	
}
