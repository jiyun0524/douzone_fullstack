package dao;

import org.apache.ibatis.annotations.Select;

import vo.UserMemberVO;

public interface LoginDAO {
	
	@Select("SELECT COUNT(*) FROM USERMEMBER WHERE ID=#{id} AND PWD = #{pwd}")
	public int idCheck(UserMemberVO userMemberVO);
	
	@Select("SELECT ID FROM USERMEMBER WHERE ID=#{id}")
	public String getId(String id);
	
}
