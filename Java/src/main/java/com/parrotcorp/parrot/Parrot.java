package com.parrotcorp.parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;
    private boolean isNailed;

    protected Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        switch(_type) {
            case EUROPEAN:
                return new EuropeanParrot(_type, numberOfCoconuts, voltage, isNailed);
            case AFRICAN:
                return new Parrot(_type, numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE:
                return new Parrot(_type, numberOfCoconuts, voltage, isNailed);
        }
        return new Parrot(_type, numberOfCoconuts, voltage, isNailed);

    }

    public double getSpeed() {
        switch(type) {
            case AFRICAN:
                return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return (isNailed) ? 0 : getBaseSpeed(voltage);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }


}
