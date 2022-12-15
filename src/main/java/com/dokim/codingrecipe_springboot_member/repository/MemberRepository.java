package com.dokim.codingrecipe_springboot_member.repository;

import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {
}
