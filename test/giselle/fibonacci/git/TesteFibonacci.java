/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giselle.fibonacci.git;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Giselle
 */
public class TesteFibonacci 
{
    @Test
    public void testFibonacci()
    {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.calcularFibonacci(0));
    }
    
}
