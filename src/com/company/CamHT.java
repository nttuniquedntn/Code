package com.company;

public class CamHT extends CarDecor{
    Car car;
    @Override
    public Double cost() {
        return car.cost() + 8;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Camera hanh trinh gia 8 trieu";
    }
}
