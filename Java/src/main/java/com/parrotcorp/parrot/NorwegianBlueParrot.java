package com.parrotcorp.parrot;

public class NorwegianBlueParrot extends Parrot {
    public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super();
        this.voltage = voltage;
        this.isNailed = isNailed;
    }


    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

}
