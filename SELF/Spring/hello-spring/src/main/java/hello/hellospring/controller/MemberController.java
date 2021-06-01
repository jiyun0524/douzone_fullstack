package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

//    spring container에서는 한번 등록해서 쓰면 됨
//    private final MemberService memberService = new MemberService();
//    이렇게 하지말고
    private final MemberService memberService;

//    생성자로 연결(호출)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


}
