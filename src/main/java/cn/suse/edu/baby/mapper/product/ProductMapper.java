package cn.suse.edu.baby.mapper.product;

import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.product.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {
    List<Product> list(String username);

    List<Product> list1(Product proName);

    List<Product> list11(Product proName);

    void update(Product product);
    void update1(Product product);
    void update2(Product product);
    void insert(Product product);

    void delete(int id);

}
