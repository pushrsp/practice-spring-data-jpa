package com.example.practicespringdatajpa.repository;

import com.example.practicespringdatajpa.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
