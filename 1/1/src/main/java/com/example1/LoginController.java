package com.example1;

public class LoginController {
    private AccountService accountService;

    public LoginController(String url, String username, String password) {
        this.accountService = new AccountService(url, username, password);
    }

    public boolean authenticate(String username, String password) {
        return accountService.isValidLogin(username, password);
    }
}
