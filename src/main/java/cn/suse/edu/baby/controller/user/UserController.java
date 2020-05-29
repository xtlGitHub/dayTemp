package cn.suse.edu.baby.controller.user;


import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.user.UserDto;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.user.User;
import cn.suse.edu.baby.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/login")
    public UserDto login(User user){
        return userService.login(user);
    }

    @PostMapping("/user/register")
    public UserDto register(User user){
        return userService.register(user);
    }

    @GetMapping("/user/list")
    @ResponseBody
    public UserDto list(String username){

        return userService.list(username);
    }
    @GetMapping("/user/list1")
    @ResponseBody
    public UserDto list( User username){

        return userService.list(username);
    }
    @PostMapping("/user/update")
    public UserDto update(User user){
        return userService.update(user);
    }
    @PostMapping("/user/insert")
    public UserDto insert(User user){
        return userService.insert(user);
    }

    @PostMapping("/user/delete")
    public UserDto delete(int id){
        return userService.delete(id);
    }

}
