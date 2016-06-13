/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreammaker;

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;

import org.junit.rules.ExpectedException;

/**
 *
 * @author Ecolon
 */
public class AgregarInventario1Test {

    // Utilizados esto para poder obtener la exception que genera cuando se hace un input con algun numero negativo
    @Rule
    public final ExpectedException excepcion = ExpectedException.none();

    
    @Test
    public void agregarInventario1() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        Inventario inv = new Inventario();

        String varYogurt = "5";
        String varFresas = "3";
        String varAlmendras = "7";
        String varChocolate = "2";

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);

        String lines[] = iceMaker.checkInventario().split("\\r?\\n");

        assertEquals("Yogurt: " + inv.getYogurt(), lines[0]);
        assertEquals("Fresas: " + inv.getFresas(), lines[1]);
        assertEquals("Almendras: " + inv.getAlmendras(), lines[2]);
        assertEquals("Chocolate: " + inv.getChocolate(), lines[3]);
    }

    @Test
    public void agregarInventario2() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varFresas = "3";
        String varAlmendras = "7";
        String varChocolate = "2";

        String varYogurt = "-1";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario3() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varAlmendras = "7";
        String varChocolate = "2";

        String varFresas = "-1";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario4() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varFresas = "3";
        String varChocolate = "2";

        String varAlmendras = "-1";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario5() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varFresas = "3";
        String varAlmendras = "7";

        String varChocolate = "-1";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario6() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "a";
        String varFresas = "3";
        String varAlmendras = "7";
        String varChocolate = "2";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario7() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varFresas = "a";
        String varAlmendras = "7";
        String varChocolate = "2";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario8() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varFresas = "3";
        String varAlmendras = "a";
        String varChocolate = "2";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

    @Test
    public void agregarInventario9() throws InventoryException {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String varYogurt = "5";
        String varFresas = "3";
        String varAlmendras = "7";
        String varChocolate = "a";

        excepcion.expect(InventoryException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero entero positivo");

        iceMaker.addInventario(varYogurt, varFresas, varAlmendras, varChocolate);
    }

}
