package com.test.tucm.jdbc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;

/**
 * jdbc测试
 */
public class JDBCTest {
    public static void main(String[] args) throws Exception {
        String URL = "jdbc:mysql://127.0.0.1:3306/haha";
        String NAME = "tucm";
        String PASSWORD = "@Abc211014259";
        Driver driver = new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection con = DriverManager.getConnection(URL, NAME, PASSWORD);
        //通过数据库的连接操作数据库，实现增删改查
        Statement stmt = con.createStatement();
        //创建sql语句
        String sql = "insert into qq_data value(?,?,?,?,?,?,?)";
        //PreparedStatement能够对SQL语句进行预编译，这样防止了SQL注入提高了安全性。
        PreparedStatement ps = con.prepareStatement(sql);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/tucm/Downloads/202202.txt"), "gbk"));
        String[] array = null;
        int count = 0;
        String line = null;
        //关闭自动提交事务
        con.setAutoCommit(false);
        int batchCount = 0;
        while ((line = bufferedReader.readLine()) != null && (!line.equals(""))) {
            try {
                array = line.split("----");
                ps.setString(1, array[0]);
                ps.setString(2, array[1]);
                ps.setString(3, array[2]);
                ps.setString(4, array[3]);
                ps.setString(5, array[4]);
                ps.setString(6, array[5]);
                ps.setString(7, line);
                ps.addBatch();
                batchCount++;
                if (batchCount == 5000) {
                    batchCount = 0;
                    //批量提交
                    ps.executeBatch();
                    con.commit();
                }
                count++;
            } catch (Exception e) {
                System.out.println("入库失败:" + e.getMessage() + line);
            }
        }
        System.out.println("入库成功，笔数" + count);
        ps.close();
    }


}
