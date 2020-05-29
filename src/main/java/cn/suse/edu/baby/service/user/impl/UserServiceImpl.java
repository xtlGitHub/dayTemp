package cn.suse.edu.baby.service.user.impl;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.user.UserDto;
import cn.suse.edu.baby.mapper.user.UserMapper;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.user.User;
import cn.suse.edu.baby.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDto login(User user) {
        UserDto userDto = new UserDto();
        int flag = userMapper.login(user);
        userDto.setFlag(flag);
        return userDto;
    }

    @Override
    public UserDto list(String username) {
        UserDto dto = new UserDto();
        List<User> list = null;
        try {

            list = userMapper.list(username);




            if(list.size() == 0){
                dto.setCount(0);
                dto.setData(null);
                dto.setMsg("没有数据");
            }else{
                List<User> list1 = new ArrayList<>();



                list.stream().forEach((user)->{
                    if(!user.getUsername().equals("admin")){
                        list1.add(user);
                    }

                });
                list.clear();
                list.addAll(list1);
                dto.setCount(list.size());
                dto.setData(list);

                dto.setCode(0);
            }
        }catch(Exception e){

            dto.setCode(500);
            dto.setData(null);
            dto.setMsg("服务器异常");
            dto.setCount(0);

        }

        return dto;
    }

    @Override
    public UserDto list(User username) {
        UserDto dto = new UserDto();
        List<User> list = null;
        try {

            list = userMapper.list1(username);


            if(list.size() == 0){
                dto.setCount(0);
                dto.setData(null);
                dto.setMsg("没有数据");
            }else{
                dto.setCount(list.size());
                dto.setData(list);

                dto.setCode(0);
            }
        }catch(Exception e){

            dto.setCode(500);
            dto.setData(null);
            dto.setMsg("服务器异常");
            dto.setCount(0);

        }

        return dto;
    }

    @Override
    public UserDto update(User user) {
        UserDto dto = new UserDto();
        try {
            userMapper.update(user);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;

    }

    @Override
    public UserDto insert(User user) {
        UserDto dto = new UserDto();
        try{

            userMapper.insert(user);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }

        return dto;
    }

    @Override
    public UserDto delete(int id) {
        UserDto dto = new UserDto();
        try{
            userMapper.delete(id);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }

    @Override
    public UserDto register(User user) {
        UserDto userDto = new UserDto();
        int flag = 1;
        try{
            if(userMapper.list11(user.getUsername()).size() >=1){
                flag = 2;
                userDto.setFlag(flag);
                userDto.setMsg("用户名已经存在");
                return  userDto;
            }
             userMapper.register(user);
             flag = 0;

        }catch (Exception e){
            flag = 1;
            userDto.setFlag(flag);
            userDto.setMsg("服务器异常");

        }
        userDto.setFlag(flag);
        return userDto;
    }


}
