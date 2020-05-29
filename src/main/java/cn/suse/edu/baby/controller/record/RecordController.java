package cn.suse.edu.baby.controller.record;

import cn.suse.edu.baby.dto.memeber.MemberDto;
import cn.suse.edu.baby.dto.record.RecordDto;
import cn.suse.edu.baby.pojo.member.Member;
import cn.suse.edu.baby.pojo.record.Record;
import cn.suse.edu.baby.service.member.MemberService;
import cn.suse.edu.baby.service.record.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping("/record/list")
    @ResponseBody
    public RecordDto list(String username){

        return recordService.list(username);
    }
    @GetMapping("/record/list1")
    @ResponseBody
    public RecordDto list( Record proName){

        return recordService.list(proName);
    }
    @PostMapping("/record/update")
    public RecordDto update(Record record){
        return recordService.update(record);
    }
    @PostMapping("/record/insert")
    public RecordDto insert(Record record){
        return recordService.insert(record);
    }

    @PostMapping("/record/delete")
    public RecordDto delete(int id){
        return recordService.delete(id);
    }

    @GetMapping("/record/listOutCount")
    public RecordDto listOutCount(){ return recordService.listOutCount();}

    @GetMapping("/record/listInCount")
    public RecordDto listInCount(){ return recordService.listInCount();}


}
