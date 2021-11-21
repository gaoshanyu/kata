package com.tdd.kata;

public class Unit {
    public final static Unit Inch = new Unit("Inch", 1);
    public final static Unit Foot = new Unit("Foot", 12);
    public final static Unit Yard = new Unit("Yard", 3 * 12);

    private final String text;
    private final int transferRateToInch;

    public Unit(String text, int transferRateToInch) {
        this.text = text;
        this.transferRateToInch = transferRateToInch;
    }

    int getAmountInInch(int amount) {
        return amount * transferRateToInch;
    }

    public String toString(int amount) {
        return String.format("%d (%s)", amount, text);
    }
}
