package cn.suse.edu.baby.dto.product;

import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.product.Product;

import java.util.List;

public class ProductDto {
    private String msg;
    private int count;
    private int code;
    private List<Product> data;

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

    public List<Product> getData() {
        return data;
    }

    public void setData(List<Product> data) {
        this.data = data;
    }
}
