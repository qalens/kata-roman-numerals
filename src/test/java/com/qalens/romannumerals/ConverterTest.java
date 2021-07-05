package com.qalens.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConverterTest {
    @ParameterizedTest
    @CsvSource({
            "1,I",
            "5,V",
            "10,X",
            "50,L",
            "100,C",
            "500,D",
            "1000,M"
    })
    public void shouldConvertSimpleNumbersThatAreNotJustPriorToBase(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "3,III",
            "30,XXX",
            "300,CCC",
            "3000,MMM"
    })
    public void shouldConvertSimpleNumbersThatAreNotJustPriorToBaseForMultiples(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "4,IV",
            "40,XL",
            "400,CD",
    })
    public void shouldConvertSimpleNumbersThatAreJustPriorToBaseFor4(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "6,VI"
    })
    public void shouldConvertSimpleNumbersThatAreJustAfterToBase(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
}
