package com.maktab.HW5.Q5;

public class NonMetalElement extends Element {
    NonMetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight );
    }
    @Override
    public void describeElement() {
        System.out.println("************");
        System.out.println("This is a nonmetal element and nonmetals are poor conductors");
        System.out.println("************");
    }
}
