package com.dokim.codingrecipe_springboot_member.repository;

import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

    // 9. 로그인 : 가입한 id로 회원 정보 조회
    // select * form member_table where memberId=?
    Optional<MemberEntity> findByMemberId(String memberId);
}
