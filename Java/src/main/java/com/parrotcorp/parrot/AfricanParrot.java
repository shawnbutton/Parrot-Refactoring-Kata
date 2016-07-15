package com.parrotcorp.parrot;


public class AfricanParrot extends Parrot {

    protected AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    public AfricanParrot(int numberOfCoconuts) {
        super();
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    private double getLoadFactor() {
        return 9.0;
    }

}
