package cn.suse.edu.baby.service.member;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.pojo.member.Member;

public interface MemberService {

    MemberDto list(String  memberName);

    MemberDto update(Member member);

    MemberDto list();

    MemberDto insert(Member member);

    MemberDto delete(int id);

    MemberDto list1(Member member);
}
