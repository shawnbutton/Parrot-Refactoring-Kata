package com.parrotcorp.parrot;


public class AfricanParrot extends Parrot {

    protected AfricanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(_type, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }

    private double getLoadFactor() {
        return 9.0;
    }

}
