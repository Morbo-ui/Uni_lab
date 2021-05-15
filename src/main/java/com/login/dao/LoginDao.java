package com.login.dao;

import Logic.Member;

import java.sql.*;

    public class LoginDao {
    String sql = "select * from member where username=? and password=?";
    public boolean check(Member member) {
        try {
            Class.forName("org.postgresql.Driver");
            try {
                Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/register_db", "postgres", "1234");
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, member.getUsername());
                st.setString(2, member.getPassword());
                ResultSet rs = st.executeQuery();
                if(rs.next())
                {
                    return true;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
