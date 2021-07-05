package com.qalens.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ConverterTest {
    @ParameterizedTest
    @CsvSource({
            "1,I",
            "3,III",
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
}
