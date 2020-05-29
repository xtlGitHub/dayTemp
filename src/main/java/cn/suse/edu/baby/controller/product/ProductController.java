package cn.suse.edu.baby.controller.product;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.product.ProductDto;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.product.Product;
import cn.suse.edu.baby.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/list")
    private ProductDto list(String username){

        return productService.list(username);

    }
    @GetMapping("/product/list1")
    @ResponseBody
    public ProductDto list(Product proName){

        return productService.list1(proName);
    }
    @PostMapping("/product/update")
    public ProductDto update(Product product){
        return productService.update(product);
    }
    @PostMapping("/product/insert")
    public ProductDto insert(Product product){
        return productService.insert(product);
    }

    @PostMapping("/product/delete")
    public ProductDto delete(int id){
        return productService.delete(id);
    }


}
