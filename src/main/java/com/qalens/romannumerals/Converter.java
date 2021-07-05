package com.qalens.romannumerals;

import jdk.jshell.spi.ExecutionControl;

public class Converter {
    public static String convert(int number){
        if(number/5 == 1){
            return "V";
        }
        return "I".repeat(number);
    }
}
