/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreammaker;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Ecolon
 */
public class ComprarHelado1Test {
    
    private final AgregarCombinacion1Test ac1 = new AgregarCombinacion1Test();


    @Test
    public void comprarHelado1() {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        int devuelta = iceMaker.makeIcecream(0, 60);
        assertEquals(10, devuelta);
//        assertEquals(60 - iceMaker.getCombos()[0].getPrice() , devuelta);
    }
    

    @Test
    public void comprarHelado2() {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        int devuelta = iceMaker.makeIcecream(0, 40);
        assertEquals(40, devuelta);
    }

    @Test
    public void comprarHelado3() {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "16";
        String fresaString = "1";
        String almendraString = "1";
        String chocolateString = "0";

        Combo r = new Combo();
        try {
            r.setName(name);
            r.setPrice(priceString);
            r.setvarYogurt(yogurtString);
            r.setvarFresas(fresaString);
            r.setvarAlmendras(almendraString);
            r.setvarChocolate(chocolateString);

            iceMaker.addCombo(r);

            assertEquals("Batida", iceMaker.getCombos()[0].getName());
            assertEquals(50, iceMaker.getCombos()[0].getPrice());
            assertEquals(16, iceMaker.getCombos()[0].getvarYogurt());
            assertEquals(1, iceMaker.getCombos()[0].getvarFresas());
            assertEquals(1, iceMaker.getCombos()[0].getvarAlmendras());
            assertEquals(0, iceMaker.getCombos()[0].getvarChocolate());

        } catch (ComboException e) {
            System.out.println(e.getMessage());
        }

        iceMaker.makeIcecream(0, 50);
        int devuelta = iceMaker.makeIcecream(0, 50);
        assertEquals(50, devuelta);

    }

}
