package cn.suse.edu.baby.pojo.user;


import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;


import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
//实现序列化的目的是为了保证流传输不出问题
public class User implements Serializable {


    private int id ;

    private String username;

    private String password;

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/
}
