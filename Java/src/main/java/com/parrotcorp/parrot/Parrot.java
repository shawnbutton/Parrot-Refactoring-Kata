package com.parrotcorp.parrot;

public class Parrot {
    protected int numberOfCoconuts = 0;
    protected double voltage;
    protected boolean isNailed;

    protected Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        switch(_type) {
            case EUROPEAN:
                return new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        }
        return new Parrot(numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return getBaseSpeed();
    };

    protected double getBaseSpeed() {
        return 12.0;
    }

}
