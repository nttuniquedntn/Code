package com.company;

public class CamLui extends CarDecor{
    Car car;
    @Override
    public Double cost() {
        return car.cost() + 5;
    }

    @Override
    public String getDescription() {
        return car.getDescription()+", Camera lui gia 5 trieu";
    }
}
