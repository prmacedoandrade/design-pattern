package com.gof.design.pattens.builder.chain;

public class Demo {

    public static void main(String[] args) {

        Account account = Account.newBuilder()
                .setUserId("user id")
                .setToken("token")
                .build();

        System.out.println(account);

    }

}
