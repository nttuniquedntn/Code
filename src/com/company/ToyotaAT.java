package com.company;

public class ToyotaAT extends Car{
    public ToyotaAT() {
        description = "Toyota Vios 1.5G AT";
    }
    @Override
    public Double cost() {
        return 625d;
    }
}
