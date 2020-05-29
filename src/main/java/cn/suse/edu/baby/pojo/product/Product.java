package cn.suse.edu.baby.pojo.product;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class Product {
    private int id;
    private String proName;
    private double proPrice;
    private String proDesc;
    private int  proStork;
    private int catagoryId;
    private String username;
}
