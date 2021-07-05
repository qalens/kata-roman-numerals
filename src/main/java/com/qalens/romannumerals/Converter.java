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
        for (int i=0;i<bases.length;i++) {
            int d = number/bases[i].value;
            if(d >= 1 && d!=4){
                return bases[i].representation.repeat(d);
            } else if(d==4){
                return bases[i].representation+bases[i-1].representation;
            }
        }
        throw new UnsupportedOperationException("Not yet Implemented");
    }
}
