package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

// 갖다 쓸게아니라서 굳이 public 아니어도 됨
class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
//    => (중요!)하나의 테스트가 끝나면 데이터를 clear를 해줘야하기 때문에 추가
    public void afterEach() {
        repository.clearStore();
    }

    @Test
//    => 얘를 실행할 수 있게 됨
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
//        반환타입이 Optional이었음. 이는 .get()으로 꺼낼 수 있음

//        간단한 방법
//        System.out.println("result = " + (result == member));

//        assertion 방식 1
//        Assertions.assertEquals(member, result);

//        assertion 방식 2 (요즘많이씀)
        assertThat(member).isEqualTo(result);
//        => member = result
//        Assertions 를 static으로 설정해주면
//        import가 추가되고 Assertions는 생략가능해짐
    }

//    이름으로 찾는거 test
    @Test
    public void findByName() {
        Member member1= new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2= new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
