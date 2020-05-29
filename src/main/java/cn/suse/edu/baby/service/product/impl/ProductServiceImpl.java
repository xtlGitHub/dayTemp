package cn.suse.edu.baby.service.product.impl;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.product.ProductDto;
import cn.suse.edu.baby.mapper.product.ProductMapper;
import cn.suse.edu.baby.mapper.record.RecordMapper;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.product.Product;
import cn.suse.edu.baby.pojo.record.Record;
import cn.suse.edu.baby.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private RecordMapper recordMapper;

    @Override
    public ProductDto list(String username) {
        ProductDto dto = new ProductDto();
        List<Product> list = null;
        try {

            list = productMapper.list(username);


            if(list.size() == 0){
                dto.setCount(0);
                dto.setData(null);
                dto.setMsg("没有数据");
            }else{
                dto.setCount(list.size());
                dto.setData(list);

                dto.setCode(0);
            }
        }catch(Exception e){

            dto.setCode(500);
            dto.setData(null);
            dto.setMsg("服务器异常");
            dto.setCount(0);

        }

        return dto;
    }

    @Override
    public ProductDto list1(Product proName) {
        ProductDto dto = new ProductDto();
        List<Product> list = null;
        try {

            list = productMapper.list1(proName);


            if(list.size() == 0){
                dto.setCount(0);
                dto.setData(null);
                dto.setMsg("没有数据");
            }else{
                dto.setCount(list.size());
                dto.setData(list);

                dto.setCode(0);
            }
        }catch(Exception e){

            dto.setCode(500);
            dto.setData(null);
            dto.setMsg("服务器异常");
            dto.setCount(0);

        }

        return dto;
    }

    @Override
    public ProductDto update(Product product) {
        ProductDto dto = new ProductDto();
        try {
            productMapper.update(product);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }

    @Override
    public ProductDto insert(Product product) {
        ProductDto dto = new ProductDto();
        try{
            productMapper.insert(product);
            //在出入库中记录一下
            Record record = new Record();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            record.setProDate(format.format(new Date()));
            record.setProNum(product.getProStork());
            record.setProType("1");
            record.setProMoney(product.getProPrice()*product.getProStork());
            //查询插入的商品的ID
            record.setProId(productMapper.list11(product).get(0).getId());
            recordMapper.insert(record);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }

        return dto;
    }

    @Override
    public ProductDto delete(int id) {
        ProductDto dto = new ProductDto();
        try{
            productMapper.delete(id);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }
}
