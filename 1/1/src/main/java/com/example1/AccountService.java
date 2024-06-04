package com.example1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountService {
    private Connection connection;

    public AccountService(String url, String username, String password) {
        try {
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // Log the error and handle it appropriately
            e.printStackTrace();
        }
    }

    public boolean isValidLogin(String username, String password) {
        try (PreparedStatement stmt = connection.prepareStatement("SELECT Tendangnhap,Matkhau FROM taikhoan WHERE Tendangnhap = ? AND Matkhau = ?")) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            // Log the error and handle it appropriately
            e.printStackTrace();
        }
        return false;
    }

    // Other account-related methods can be added here
}