package com.register.dao;

import Logic.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    private String dbUrl = "jdbc:postgresql://localhost:5432/register_db";
    private String dbUname = "postgres";
    private String dbPassword = "1234";
    private String dbDriver = "org.postgresql.Driver";

    public void loadDriver(String dbDriver) {
        try {
            Class.forName(dbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con =  DriverManager.getConnection(dbUrl, dbUname, dbPassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    return con;
    }

    public String insert(Member member) {
        loadDriver(dbDriver);
        Connection con = getConnection();
        String result = "Data entered successfully";
        String sql = "INSERT INTO member VALUES (?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, member.getUsername());
            ps.setString(2, member.getPassword());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            result = "Data not entered";
        }
        return result;
    }

}
