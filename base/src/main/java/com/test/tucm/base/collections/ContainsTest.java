package com.test.tucm.base.collections;

import java.util.ArrayList;
import java.util.List;

public class ContainsTest {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user = new User("1", "2");
        list.add(user);
        User user2 = new User("1", "2");
        if (list.contains(user2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        List<String> strings = new ArrayList<>();
        strings.add("abc");
        if (strings.contains("abc")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
