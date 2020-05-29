package cn.suse.edu.baby.dto.memeber;

import cn.suse.edu.baby.pojo.member.Member;

import java.io.Serializable;
import java.util.List;

public class MemberDto implements Serializable {
    private String msg;
    private int count;
    private int code;
    private List<Member> data;

    public String getMsg() {
        return msg;
    }

    public void setData(List<Member> data) {
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Member> getData() {
        return data;
    }


}
