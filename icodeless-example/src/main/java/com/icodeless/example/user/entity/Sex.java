package com.icodeless.example.user.entity;

public enum Sex {
    UNKNOWN(0),
    MAN(1),
    WOMAN(2),
    ;

    Sex(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }
}
