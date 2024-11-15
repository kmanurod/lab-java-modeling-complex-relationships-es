package com.example.nursingassociation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nursingassociation.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

