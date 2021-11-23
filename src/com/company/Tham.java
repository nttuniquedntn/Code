package com.company;

public class Tham extends CarDecor{
    Car car;
    @Override
    public Double cost() {
        return car.cost() + 1;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Tham lot san gia 1 trieu";
    }
}
