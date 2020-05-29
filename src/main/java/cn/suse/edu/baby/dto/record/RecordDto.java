package cn.suse.edu.baby.dto.record;

import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.record.RecordPro;

import java.util.Date;
import java.util.List;

public class RecordDto  {
    private String msg;
    private int count;
    private int code;
    private List<RecordPro> data;
    private Date proDate;
    public String getMsg() {
        return msg;
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

    public List<RecordPro> getData() {
        return data;
    }

    public void setData(List<RecordPro> data) {
        this.data = data;
    }
}
