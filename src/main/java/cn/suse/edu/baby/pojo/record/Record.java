package cn.suse.edu.baby.pojo.record;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class Record {
    private int id;
    private String proType;
    private int proNum;
    private int proId;
    private double proMoney;
    private String proDate;
    private String username;
}
