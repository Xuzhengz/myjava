package com.xzz.day02;

/**
 * @author 徐正洲
 * @date 2022/5/2-17:18
 */
public class Customer2 {
    private String firstName;
    private String lastName;
    private Account2 account;

    public Customer2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account2 getAccount() {
        return account;
    }

    public void setAccount(Account2 account) {
        this.account = account;
    }
}