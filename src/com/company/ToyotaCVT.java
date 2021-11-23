package com.company;

public class ToyotaCVT extends Car{
    public ToyotaCVT() {
        description = "Toyota Vios 1.5E CVT";
    }

    @Override
    public Double cost() {
        return 600d;
    }
}
