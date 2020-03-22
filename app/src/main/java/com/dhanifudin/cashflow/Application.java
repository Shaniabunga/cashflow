package com.dhanifudin.cashflow;

import com.dhanifudin.cashflow.models.Account;

public class Application extends android.app.Application {

    private static Account account;

    @Override
    public void onCreate() {
        account = new Account("Shania");
        super.onCreate();
    }

    public static Account getAccount() {
        return account;
    }
}
