package com.dokim.codingrecipe_springboot_member.service;

import com.dokim.codingrecipe_springboot_member.dto.MemberDTO;
import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import com.dokim.codingrecipe_springboot_member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    // 회정 가입
    public void save(MemberDTO memberDTO) {
        // 1. DTO => Entity 변환
        // 2. Repository의 save 메서드 호출

        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

    // 9. 로그인
    public MemberDTO login(MemberDTO memberDTO) {
        // 1. 회원이 입력한 id을 DB에서 조회
        // 2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단

        Optional<MemberEntity> byMemberId = memberRepository.findByMemberId(memberDTO.getMemberId());
        if (byMemberId.isPresent()) {
            MemberEntity memberEntity = byMemberId.get();
            if (memberEntity.getPassword().equals(memberDTO.getPassword())) {
                return MemberDTO.memberDTO(memberEntity);
            } else
                return null;
        } else
            return null;

    }


    //10. 회원 목록 출력
    public List<MemberDTO> findAll(){
        List<MemberEntity> memberEntityList = memberRepository.findAll();

        List<MemberDTO> memberDTOList = new ArrayList<>();
        for (MemberEntity memberEntity : memberEntityList){
            memberDTOList.add(MemberDTO.memberDTO(memberEntity));
        }

        return memberDTOList;
    }


    // 삭제
    public void delete(Integer id){
        memberRepository.deleteById(id);
    }
}
