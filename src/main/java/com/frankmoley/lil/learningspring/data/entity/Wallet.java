package com.frankmoley.lil.learningspring.data.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Component
@Scope(value="prototype")
public class Wallet {
    private int value;

    public Wallet() {
        System.out.println("Creating wallet..");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "value=" + value +
                '}';
    }
}
