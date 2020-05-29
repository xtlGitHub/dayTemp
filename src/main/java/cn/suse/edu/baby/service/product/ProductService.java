package cn.suse.edu.baby.service.product;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.product.ProductDto;
import cn.suse.edu.baby.pojo.product.Product;

public interface ProductService {
    ProductDto list(String username);

    ProductDto list1(Product proName);

    ProductDto update(Product product);

    ProductDto insert(Product product);

    ProductDto delete(int id);
}
