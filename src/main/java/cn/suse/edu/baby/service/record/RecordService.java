package cn.suse.edu.baby.service.record;

import cn.suse.edu.baby.dto.record.RecordDto;
import cn.suse.edu.baby.pojo.product.Product;
import cn.suse.edu.baby.pojo.record.Record;

public interface RecordService {
    RecordDto list(String username);

    RecordDto list(Record proName);

    RecordDto update(Record record);

    RecordDto insert(Record record);

    RecordDto delete(int id);

    RecordDto listOutCount();

    RecordDto listInCount();

}
