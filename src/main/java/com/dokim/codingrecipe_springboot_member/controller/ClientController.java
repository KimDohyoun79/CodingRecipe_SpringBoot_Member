package com.dokim.codingrecipe_springboot_member.controller;

import com.dokim.codingrecipe_springboot_member.dto.MemberDTO;
import com.dokim.codingrecipe_springboot_member.entity.MemberEntity;
import com.dokim.codingrecipe_springboot_member.repository.MemberRepository;
import com.dokim.codingrecipe_springboot_member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClientController {

    // 4. 기본 페이지
    @GetMapping("/home")
    public String home() {
        return "home";
    }


    // 5~8. 회원가입 페이지
    @GetMapping("/member/join")
    public String join() {
        return "join";
    }


    private final MemberService memberService;

    @PostMapping("/member/join")
    public String join2(MemberDTO member) {
        System.out.println("member = " + member.toString()
        );
        memberService.save(member);
        return "redirect:/home";
    }


    // 9. 로그인
    @GetMapping("/member/login")
    public String login() {
        return "login";
    }

    @PostMapping("/member/login")
    public String login2(MemberDTO memberDTO) {
        MemberDTO loginResult = memberService.login(memberDTO);

        if (loginResult != null) {
            return "redirect:/home";
        } else
            return "redirect:/login";
    }

    // 10. 회원 목록 출력
    @GetMapping("/member/list")
    public String memberList(Model model) {

        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute(memberDTOList);
        return "list";
    }


    // 삭제
    @GetMapping("/member/delete/{id}")
    public String memberDelete(@PathVariable("id") Integer id){
        memberService.delete(id);
        return "redirect:/member/list";
    }

}
