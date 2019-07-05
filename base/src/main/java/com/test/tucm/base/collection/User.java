package com.test.tucm.base.collection;

/**
 * @ClassName User
 * @Description TODO
 * @Author TUCM
 * @Date 2019/7/5 17:38
 * @Version 1.0
 **/
public class User {
    private String name;
    private String pswd;

    public User(String name, String pswd) {
        this.name = name;
        this.pswd = pswd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
