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
public class BorrarCombinacion1Test {

    @Test
    public void borrarcombinacion1() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
//        this.AgregarCombinacion1Test();
        AgregarCombinacion1Test ac1 = new AgregarCombinacion1Test();
        ac1.agregarCombinacion1();

        String ComboDeleted = iceMaker.deleteCombo(0);

        assertEquals("Batida", ComboDeleted);

    }

    @Test
    public void borrarcombinacion2() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        iceMaker.deleteCombo(0);

        assertEquals(null, iceMaker.getCombos()[0]);

    }

}
