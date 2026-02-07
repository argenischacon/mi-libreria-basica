package com.argenischacon.milibreria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcualdoraTest {

    @Test
    public void testSumar(){
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }
}
