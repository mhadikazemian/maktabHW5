package com.maktab.HW5.Q5;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[2];
        elements [0] = new MetalElement("Fe", 26,55.845 );
        elements [1] = new NonMetalElement("C", 6, 12.01);
        for (int i = 0; i < 2 ; i++) {
            elements[i].describeElement();
        }

    }
}
