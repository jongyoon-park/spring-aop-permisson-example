package com.c.aopauth.data.model;

import lombok.Getter;

public enum ApiPermission {

    createOrder(false),
    getOrderList(true),
    cancelOrder(false),
    createAccount(false),
    getAccountList(true),
    deleteAccount(false),
    createEvent(false),
    getEventList(true),
    selectPrizeWinner(false);

    @Getter
    boolean mandatory;

    ApiPermission(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
