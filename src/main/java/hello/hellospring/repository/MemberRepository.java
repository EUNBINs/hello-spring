package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);         // Null 반환하는 방법 중 하나
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
