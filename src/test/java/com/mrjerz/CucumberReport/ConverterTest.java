package com.mrjerz.CucumberReport;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    private Converter converter;

    @Before
    public void setUp(){
        converter = new Converter();
    }

    @Test
    public void stringify() {
        assertEquals("TestString", converter.stringify());
    }
}