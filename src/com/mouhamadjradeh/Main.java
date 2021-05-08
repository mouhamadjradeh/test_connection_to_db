package com.mouhamadjradeh;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:postgresql://localhost:5432/cours";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "lailaplpl";

    public static void main(String[] args) {
        System.out.println("kk");
            try {
                //Class.forName("org.postgresql.Driver");
                Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException se) {
                System.out.println(se);
            }

        }
}