package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;
// ctrl + shift + t : 이거랑 연결된 Test 파일 만들기
public class MemberService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    같은 값을 참조하는지 명확하지 않기 때문에 이렇게 작성
//    직접 내가 new 로 생성하는게 아니라 외부의 것을 가지고 오는거기 때문에 동일한 것 참조
      private final MemberRepository memberRepository;

      public MemberService(MemberRepository memberRepository) {
          this.memberRepository = memberRepository;
      }

//    <<<<< 회원가입 >>>>>
//    조건 : 같은 이름이 있는 중복 회원은 안되게
/*
    public Long join(Member member) {
        Optional<Member> result = memberRepository.findByName(member.getName());

//        optional로 반환이 됐기 때문에
//        Optional 안에 member 객체가있어서 Optional의 함수를 사용할 수 있음 !
//        m(멤버)이 null이 아니라 어떠한 값이 있으면~
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원이다 !!");
        });

        memberRepository.save(member);
        return member.getId();
*/
//        -> 주석 사이에 들어가는 코드를 이렇게 적을 수 있음 !
    public Long join (Member member) {
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
//        그냥 임의로 id 반환하도록 함
    }
    private void validateDuplicateMember(Member member){
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원이다 !!");
                });
    }
//    <<<<< 전체 회원 조회 >>>>>
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}