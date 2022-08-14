package com.org.tav.day9;
 
public class BridgeMain {
    public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(100);
        account.withdraw(75);
        account.withdraw(275);
        if (account.isBalanceLow()) {
            // you can also change the Logger implementation at runtime
            account.setLogger(Logger.warning());
        }

        account.withdraw(10);
        account.withdraw(100);
    }
}