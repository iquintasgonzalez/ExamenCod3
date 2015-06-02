/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 *
 * @author iquintasgonzalez
 */

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 *
 * @author Borja
 */

@RunWith(Parameterized.class)
public class CalculoParametricTest {

 private double result;
    private Calculo mod = new Calculo();
    
    
   @Before
   public void initialize() {
   
   
   }

    public CalculoParametricTest(Calculo mod,double result) {
      this.mod = mod;
      this.result = result;
   }

    /*
    *Bateria de 4 tests
    */ 

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { new Calculo (2,2),2},
         { new Calculo(3,1),2}, //este es erroneo a proposito como prueba
         { new Calculo (4,8),4},
         { new Calculo (6,12),6}
         
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " +result);
      assertEquals(result,mod.obtenerMCD(mod.getNumero1(),mod.getNumero2()),0.1);
   }
   
   
   @Test
   public void testMensajeCorrecto(){
   
       
        System.out.println("Numeros correctamente introduzidos");
        Calculo instance = new Calculo();
        instance.setNumero1(5);
        instance.setNumero2(8);
        
        String expectedResult="Cálculo correcto";
        
        assertEquals(expectedResult,instance.Validacion());
   
   }
   
   @Test
   public void testMensajeErrorNum1(){
   
       
        System.out.println("Numeros incorrectamente introduzidos");
        Calculo instance = new Calculo();
        instance.setNumero1(-5);
        instance.setNumero2(8);
        
        String expectedResult="Error";
        
        assertEquals(expectedResult,instance.Validacion());
   
   }
   
   @Test
   public void testMensajeErrorNum2(){
   
       
        System.out.println("Numeros incorrectamente introduzidos");
        Calculo instance = new Calculo();
        instance.setNumero1(5);
        instance.setNumero2(-8);
        
        String expectedResult="Error";
        
        assertEquals(expectedResult,instance.Validacion());
   
   }
   
} 