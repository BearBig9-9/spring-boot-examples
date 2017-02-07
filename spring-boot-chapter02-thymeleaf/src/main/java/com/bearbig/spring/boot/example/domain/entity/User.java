package com.bearbig.spring.boot.example.domain.entity;

/**
 * <p>用户信息</p>
 *
 * @author xiongyu
 * @version $Id: com.bearbig.spring.boot.example.domain.entity 2017/2/5 09:22 xiongyu $
 */
public class User {

    private String id;
    private String name;
    private String pwd;

    public User(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
