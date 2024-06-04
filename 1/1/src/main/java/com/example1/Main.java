package com.example1;
import java.util.Scanner;
public class Main {

// Usage example
public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/dangnhap";
    String dbUsername = "root";
    String dbPassword = "Minh2002";
    Scanner scanner = new Scanner(System.in);
    LoginController loginController = new LoginController(url, dbUsername, dbPassword);
    System.out.print("Nhập tên người dùng: ");
    String inputUsername = scanner.nextLine();

    System.out.print("Nhập mật khẩu: ");
    String inputPassword = scanner.nextLine();

    // Bây giờ bạn có thể sử dụng các biến inputUsername và inputPassword
    System.out.println("Tên người dùng: " + inputUsername);
    System.out.println("Mật khẩu: " + inputPassword);
    if (loginController.authenticate(inputUsername, inputPassword)) {
        System.out.println("Login successful!");
    } else {
        System.out.println("Invalid login credentials.");
    }
}
}
