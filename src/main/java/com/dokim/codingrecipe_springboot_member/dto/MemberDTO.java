package com.dokim.codingrecipe_springboot_member.dto;

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
}
