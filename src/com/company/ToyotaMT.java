package com.company;

public class ToyotaMT extends Car{
    public ToyotaMT() {
        description = "Toyota Vios 1.5E MT";
    }
    @Override
    public Double cost() {
        return 585d;
    }
}
