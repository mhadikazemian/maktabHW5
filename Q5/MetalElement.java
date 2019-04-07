package com.maktab.HW5.Q5;

public class MetalElement extends Element {

    //class constructor:
    MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol,atomicNumber,atomicWeight);
    }

    //Overriding abstract method:
    @Override
    public void describeElement() {
        System.out.println("************");
        System.out.println("Element symbol is: " + this.getSymbol());
        System.out.println("Element atomic number is: " + this.getAtomicNumber());
        System.out.println("Element atomic weight is: " + this.getAtomicWeight());
        System.out.println("This is a metal element and metals are good conductors of electricity");
        System.out.println("************");
    }

}//end of Element class
