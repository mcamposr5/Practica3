/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.gyt.gytprueba.practica3;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lunit
 */
public class NombreIT {
    public static Nombre fB;
    public NombreIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        fB = new Nombre();
    }
    
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        assertEquals(fizzBuzz, "Fizz");
    }
    
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        assertEquals(fizzBuzz, "Buzz");
    }
    
    
}
