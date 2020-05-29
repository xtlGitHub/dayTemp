package cn.suse.edu.baby.mapper.user;

import cn.suse.edu.baby.pojo.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    int login(User user);

    List<User> list(String username);

    List<User> list1(String username);

    List<User> list1(User user);

    List<User> list11(String username);

    void insert(User user);

    void delete(int id);

    void update(User user);

    void register(User user);
}
