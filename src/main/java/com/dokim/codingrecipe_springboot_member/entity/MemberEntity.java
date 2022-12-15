package com.dokim.codingrecipe_springboot_member.entity;

import com.dokim.codingrecipe_springboot_member.dto.MemberDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String memberId;
    private String password;
    private String name;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.memberId = memberDTO.getMemberId();
        memberEntity.password = memberDTO.getPassword();
        memberEntity.name = memberDTO.getName();
        return memberEntity;
    }
}
