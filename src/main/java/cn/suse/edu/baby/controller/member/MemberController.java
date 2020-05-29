package cn.suse.edu.baby.controller.member;


import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.user.UserDto;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.user.User;
import cn.suse.edu.baby.service.member.MemberService;
import cn.suse.edu.baby.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping("/member/list")
    @ResponseBody
    public MemberDto list(String username){

        return memberService.list(username);
    }
    @GetMapping("/member/list1")
    @ResponseBody
    public MemberDto list( Member memberName){

        return memberService.list1(memberName);
    }
    @PostMapping("/member/update")
    public MemberDto update(Member member){
        return memberService.update(member);
    }
    @PostMapping("/member/insert")
    public MemberDto insert(Member member){
        return memberService.insert(member);
    }

    @PostMapping("/member/delete")
    public MemberDto delete(int id){
        return memberService.delete(id);
    }
}
