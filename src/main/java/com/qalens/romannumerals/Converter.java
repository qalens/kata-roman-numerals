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
        if (number == 0)
            return "";
        for (int i=0;i<bases.length;i++) {
            int pow10d = number*10/bases[i].value;
            if(pow10d == 9){
                int power10remainder = number + bases[i+2].value - bases[i].value;
                return bases[i+2].representation + bases[i].representation + convert(power10remainder);
            }
            int d = number/bases[i].value;
            int remainder = number % bases[i].value;
            if(d >= 1 && d!=4){
                return bases[i].representation.repeat(d)+convert(remainder);
            } else if(d==4){
                return bases[i].representation+bases[i-1].representation+convert(remainder);
            }
        }
        throw new UnsupportedOperationException("Not yet Implemented");
    }
}
