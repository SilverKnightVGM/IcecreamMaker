/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreammaker;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enzo
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of mainMenu method, of class Main.
     */
    @Test
    public void revisarOpciones1() {
        System.out.println("mainMenu");
        //replace System.in with you own stream
        String stdin = "0";
        ByteArrayInputStream in = new ByteArrayInputStream(stdin.getBytes());
        System.setIn(in);
        Main.mainMenu();
        // optionally, reset System.in to its original
        System.setIn(System.in);
    }
    
    @Test
    public void revisarOpciones2() {
        System.out.println("Funcionalidad Agregar Combinación");
        Main.addCombo();
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
