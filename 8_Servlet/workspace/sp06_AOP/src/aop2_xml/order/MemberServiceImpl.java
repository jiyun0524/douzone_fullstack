package aop2_xml.order;

public class MemberServiceImpl implements MemberService {

	@Override
	public void register() {
		System.out.println("register 함수 호출");
	}

	@Override
	public void update(String memberId) {
		System.out.println("update 함수 호출 ");
	}

}
