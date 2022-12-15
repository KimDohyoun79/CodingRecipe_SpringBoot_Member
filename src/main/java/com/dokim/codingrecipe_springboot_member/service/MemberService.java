package com.dokim.codingrecipe_springboot_member.service;

import com.dokim.codingrecipe_springboot_member.dto.MemberDTO;
import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import com.dokim.codingrecipe_springboot_member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO){
        // 1. DTO => Entity 변환
        // 2. Repository의 save 메서드 호출

        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
}
