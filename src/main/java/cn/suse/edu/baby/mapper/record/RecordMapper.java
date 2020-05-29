package cn.suse.edu.baby.mapper.record;

import cn.suse.edu.baby.pojo.product.Product;
import cn.suse.edu.baby.pojo.record.Record;
import cn.suse.edu.baby.pojo.record.RecordPro;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RecordMapper {
    List<RecordPro> list(String username);

    List<RecordPro> list1(Record proName);

    void update(Record record);

    void delete(int id);

    void insert(Record record);

    List<RecordPro> listOutCount();

    List<RecordPro> listInCount();
}
