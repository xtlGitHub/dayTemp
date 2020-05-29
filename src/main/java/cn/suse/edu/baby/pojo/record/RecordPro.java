package cn.suse.edu.baby.pojo.record;

import cn.suse.edu.baby.pojo.product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class RecordPro extends Product {
    private int id;
    private String proType;
    private int proNum;
    private int proId;
    private double proMoney;
    private String proDate;
}
