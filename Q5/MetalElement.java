package com.maktab.HW5.Q5;

public class MetalElement extends Element {
    MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol,atomicNumber,atomicWeight);
    }
    @Override
    public void describeElement() {
        System.out.println("************");
        System.out.println("This is a metal element and metals are good conductors of electricity");
        System.out.println("************");
    }
}
