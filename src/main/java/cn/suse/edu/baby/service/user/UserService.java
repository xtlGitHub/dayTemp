package cn.suse.edu.baby.service.user;

import cn.suse.edu.baby.dto.user.UserDto;
import cn.suse.edu.baby.pojo.user.User;

public interface UserService {
    UserDto login(User user);

    UserDto list(String Username);

    UserDto list(User username);

    UserDto update(User user);

    UserDto insert(User user);

    UserDto delete(int id);

    UserDto register(User user);
}
