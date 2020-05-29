package cn.suse.edu.baby.mapper.member;


import cn.suse.edu.baby.pojo.member.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    List<Member> list1(Member memberName);

    void update(Member member);

    List<Member> list(String username);

    void insert(Member member);

    void delete(int id);
}
