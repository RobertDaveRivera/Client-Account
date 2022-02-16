package com.robert.rivera.customer.entity;

public enum AccountTypes  {
    SAVINGS("S -savings"),
    CHECKING("C - checking");

    private final String accounts;

    AccountTypes(String accounts) {
        this.accounts = accounts;
    }
}