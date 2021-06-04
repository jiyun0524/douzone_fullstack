// MemberVO.java 
package kr.co.vo;

import java.util.Date;

public class MemberVO {
	private String mId;
	private String mPwd;
	private String mName;
	private Date regDate;

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPwd() {
		return mPwd;
	}

	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberVO [mId=" + mId + ", mPwd=" + mPwd + ", "
				+ "mName=" + mName + ", regDate=" + regDate + "]";
	}
}
