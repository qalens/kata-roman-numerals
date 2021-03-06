package com.qalens.romannumerals;

import org.junit.jupiter.api.Assertions;
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
            "6,VI",
            "11,XI",
            "60,LX",
            "110,CX",
            "600,DC",
            "1100,MC",
            "1666,MDCLXVI",
    })
    public void shouldConvertSimpleNumbersThatAreJustAfterToBase(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "9,IX",
            "90,XC",
            "900,CM",
    })
    public void shouldConvertSimpleNumbersThatAreJustPriorTo10PowerBase(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "91,XCI",
            "94,XCIV",
            "99,XCIX",
            "991,CMXCI"
    })
    public void shouldSupportMoreNumbersThatAreJusPriorTo10PowerBaseAndNotPerfectMultiple(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "888,DCCCLXXXVIII"
    })
    public void shouldHandleDigit8(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
    @ParameterizedTest
    @CsvSource({
            "41,XLI",
            "44,XLIV",
            "444,CDXLIV",
    })
    public void shouldConvertSimpleNumbersThatAreJustPriorToBase5WithNoPerfectDivision(int number, String expected){
        Assertions.assertEquals(expected,Converter.convert(number));
    }
}
