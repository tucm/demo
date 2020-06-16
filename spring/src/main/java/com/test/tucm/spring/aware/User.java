package com.test.tucm.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @ClassName User
 * @Description TODO
 * @Author owl
 * @Date 2020-04-06 21:50
 * @Version 1.0
 **/
public class User implements BeanNameAware {

    private String id;

    private String name;

    private String address;
    @Override
    public void setBeanName(String name) {
        id=name;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
