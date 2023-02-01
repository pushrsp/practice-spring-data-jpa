package com.example.practicespringdatajpa.repository;

import com.example.practicespringdatajpa.entity.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberJpaRepository {

    private final EntityManager em;

    public Member save(Member member) {
        em.persist(member);

        return member;
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }

}
