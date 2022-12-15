package com.dokim.codingrecipe_springboot_member.dto;

import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDTO {
    private Integer id;

    private String memberId;
    private String password;
    private String name;

    // 9. 로그인
    public static MemberDTO memberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();

        memberDTO.id = memberEntity.getId();
        memberDTO.memberId = memberEntity.getMemberId();
        memberDTO.password = memberEntity.getPassword();
        memberDTO.name = memberEntity.getName();
        return memberDTO;
    }
}
