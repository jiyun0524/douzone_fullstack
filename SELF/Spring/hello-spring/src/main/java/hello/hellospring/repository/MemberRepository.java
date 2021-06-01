package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

// interface로 만듬
public interface MemberRepository {
    Member save(Member member);
//    null을 보내더라도 Optional에 감싸서 보내는 것을 요즘 선호함 !
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
