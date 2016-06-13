/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreammaker;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Ecolon
 */
public class RevisarInventarioTest {

    
    @Test
    public void revisarInventario() {
        IcecreamMaker iceMaker = new IcecreamMaker();
        assertNotNull(iceMaker.checkInventario());

        System.out.println("\nrevisarInventario(): \n" + iceMaker.checkInventario());
    }
    

}
