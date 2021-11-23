package com.company;

public class Screen extends CarDecor{
    Car car;
    @Override
    public Double cost() {
        return car.cost() + 7;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+" Man Hinh 12 inch gia 7 Trieu";
    }
}
