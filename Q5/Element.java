package com.maktab.HW5.Q5;

public abstract class Element {

    //class variables:
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    //class constructors:
    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public Element() {

    }

    //getters and setters:
    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void describeElement();
    
}//end of Element class
