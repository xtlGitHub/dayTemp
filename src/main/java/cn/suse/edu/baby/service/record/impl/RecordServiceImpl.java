package cn.suse.edu.baby.service.record.impl;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.record.RecordDto;
import cn.suse.edu.baby.mapper.product.ProductMapper;
import cn.suse.edu.baby.mapper.record.RecordMapper;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.product.Product;
import cn.suse.edu.baby.pojo.record.Record;
import cn.suse.edu.baby.pojo.record.RecordPro;
import cn.suse.edu.baby.service.record.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public RecordDto list(String username) {
        RecordDto dto = new RecordDto();
        List<RecordPro> list = null;
        try {

            list = recordMapper.list(username);


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
    public RecordDto list(Record proName) {
        RecordDto dto = new RecordDto();
        List<RecordPro> list = null;
        try {

            list = recordMapper.list1(proName);


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
    public RecordDto update(Record record) {
        RecordDto dto = new RecordDto();
        try {
            recordMapper.update(record);
            //出库  商品库存-
            if(record.getProType().equals("0")){
                Product product = new Product();
                product.setId(record.getProId());
                product.setProStork(record.getProNum());
                productMapper.update1(product);
            }
            //入库  商品库存+
            if(record.getProType().equals("1")){

                Product product = new Product();
                product.setId(record.getProId());
                product.setProStork(record.getProNum());
                productMapper.update2(product);
            }
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }

    @Override
    public RecordDto insert(Record record) {
        RecordDto dto = new RecordDto();
        try{
            recordMapper.insert(record);
            //出库  商品库存-
            if(record.getProType().equals("0")){
                Product product = new Product();
                product.setId(record.getProId());
                product.setProStork(record.getProNum());
                productMapper.update1(product);
            }
            //入库  商品库存+
            if(record.getProType().equals("1")){

                Product product = new Product();
                product.setId(record.getProId());
                product.setProStork(record.getProNum());
                productMapper.update2(product);
            }
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }

        return dto;
    }

    @Override
    public RecordDto delete(int id) {
        RecordDto dto = new RecordDto();
        try{
            recordMapper.delete(id);
            dto.setCode(0);
        }catch(Exception e){
            dto.setCode(500);

        }
        return dto;
    }

    @Override
    public RecordDto listOutCount() {
        RecordDto dto = new RecordDto();
        List<RecordPro> list = null;
        try {

            list = recordMapper.listOutCount();


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
    public RecordDto listInCount() {
        RecordDto dto = new RecordDto();
        List<RecordPro> list = null;
        try {

            list = recordMapper.listInCount();


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
}
