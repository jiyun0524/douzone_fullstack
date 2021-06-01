package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
//  MemberService memberService = new MemberService();
//  MemoryMemberRepository memberRepository = new MemoryMemberRepository();
//    두번째 줄은 clear를 하기위해서 추가하는 부분 (여기도 명확성 때문에 아래와 같이 바꿈)
    MemberService memberService;
    MemoryMemberRepository memberRepository;

//   @BeforeEach : MemberService 에서
//   맨 첫부분(같은 값을 참조하는지 명확하지 ~)를 위해 작성
    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }


//    test는 배포 때 포함도 안되고 함수이름 한글이어도 됨
    @Test
    void 회원가입() {
//        given, when, then 으로 큰 규모의 테스트를 규격화 함
//        given 이런 조건/상황이 주어졌었구나 ~
        Member member = new Member();
        member.setName("hello");
//        => hello가 spring이면 안됨 이미 회원이라서 충돌함
//        @AfterEach를 추가하면 memory clear 가 되기 때문에 spring도 가능 !

//        when 언제 이랬구나 ~
        Long saveId = memberService.join(member);

//        then (검증)그래서 어떻게 했구나 ~
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복회원예외처리() {
//        given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

//        when
//        memberService.join(member1);
//        memberService.join(member1);
        memberService.join(member1);
//        강사님이 좋아하는 자동완성 단축키 : ctrl + alt + v
        IllegalStateException e = assertThrows(
                IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원이다 !!");
/*
        try {
            memberService.join(member2);
            fail();
        }
        catch (IllegalStateException e) {
            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원이다 !!");
//            MemberService 의 출력 문구와 같아야함 ! (다르게해도된다 왜지 ㅋㅠㅠ)
        }
*/
//        then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}