package cn.suse.edu.baby.service.member.impl;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.mapper.member.MemberMapper;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public MemberDto list(String memberName) {

        MemberDto dto = new MemberDto();
        List<Member> list = null;
        try {

                list = memberMapper.list(memberName);


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
    public MemberDto update(Member member) {
        MemberDto dto = new MemberDto();
       try {
           memberMapper.update(member);
           dto.setCode(0);
       }catch(Exception e){
           dto.setCode(500);

       }
        return dto;
    }

    @Override
    public MemberDto list() {
       return null;
    }

    @Override
    public MemberDto insert(Member member) {
        MemberDto dto = new MemberDto();
        try{
            memberMapper.insert(member);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }

        return dto;
    }

    @Override
    public MemberDto delete(int id) {
        MemberDto dto = new MemberDto();
        try{
            memberMapper.delete(id);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }

    @Override
    public MemberDto list1(Member member) {
        MemberDto dto = new MemberDto();
        List<Member> list = null;
        try {

            list = memberMapper.list1(member);


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
}
