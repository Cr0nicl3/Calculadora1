/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 *
 * @author dam
 */
@RunWith(Parameterized.class)
public class CalculadoraTestResta {
    private int num1;
    private int num2;
    private int resul;
    
    @Parameters
public static Collection<Object[]> numeros(){
    return Arrays.asList(new Object [][]{{20,10,10},{3,2,1},{2,2,2}});
}
    public CalculadoraTestResta(int num1, int num2, int resul) {
    this.num1=num1;
    this.num2=num2;
    this.resul=resul;
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testResta() {
        Calculadora calcu=new Calculadora(num1,num2);
        int result = calcu.resta();
        assertEquals(resul, result);
    }
  
}