package com.qalens.romannumerals;

import jdk.jshell.spi.ExecutionControl;

public class Converter {
    static class Base{
        private int value;
        private String representation;

        public Base(int value, String representation) {
            this.value = value;
            this.representation = representation;
        }
    }
    public static Base[] bases= {
        new Base(1000,"M"),
        new Base(500,"D"),
        new Base(100,"C"),
        new Base(50,"L"),
        new Base(10,"X"),
        new Base(5,"V"),
        new Base(1,"I"),
    };
    public static String convert(int number){
        for (Base base:bases
             ) {
            if(number/base.value >= 1){
                return base.representation.repeat(number/base.value);
            }
        }
        throw new UnsupportedOperationException("Not yet Implemented");
    }
}
