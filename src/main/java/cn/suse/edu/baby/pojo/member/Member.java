package cn.suse.edu.baby.pojo.member;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
//实现序列化的目的是为了保证流传输不出问题
public class Member {
    private int id;
    private String memberName; //会员名
    private String memberTel;   //会员电话
    private double memberMoney; //会员存钱
    private int memberDiscount; //会员折扣
    private String username;
    public String getMemberName() {
        return memberName;
    }
}
