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
public class EditarCombinacion1Test {

    private AgregarCombinacion1Test ac1 = new AgregarCombinacion1Test();
    
    // Utilizados esto para poder obtener la exception que genera cuando se hace un input con algun numero negativo
    @Rule
    public final ExpectedException excepcion = ExpectedException.none();

    @Test
    public void editarcombinacion1() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
        String fresaString = "1";
        String almendraString = "1";
        String chocolateString = "0";

        Combo r = new Combo();
        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
        r.setvarChocolate(chocolateString);

        iceMaker.editCombo(1, r);

        assertEquals("Batida", iceMaker.getCombos()[0].getName());
        assertEquals(50, iceMaker.getCombos()[0].getPrice());
        assertEquals(3, iceMaker.getCombos()[0].getvarYogurt());
        assertEquals(1, iceMaker.getCombos()[0].getvarFresas());
        assertEquals(1, iceMaker.getCombos()[0].getvarAlmendras());
        assertEquals(0, iceMaker.getCombos()[0].getvarChocolate());
    }

    @Test
    public void editarcombinacion2() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
        String fresaString = "1";
        String almendraString = "1";
        String chocolateString = "0";

        Combo r = new Combo();
        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
        r.setvarChocolate(chocolateString);

        iceMaker.editCombo(1, r);

        assertEquals(null, iceMaker.getCombos()[1]);

    }

    @Test
    public void editarcombinacion3() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "-50";

        Combo r = new Combo();

        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Precio debe ser un numero entero positivo");

        r.setName(name);
        r.setPrice(priceString);
    }

    @Test
    public void editarcombinacion4() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "-3";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
    }

    @Test
    public void editarcombinacion5() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
        String fresaString = "-2";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
    }

    @Test
    public void editarcombinacion6() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
        String fresaString = "2";
        String almendraString = "-2";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
    }

    @Test
    public void editarcombinacion7() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
        String fresaString = "2";
        String almendraString = "2";
        String chocolateString = "-3";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero entero positivo");

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
        r.setvarChocolate(chocolateString);
    }

    @Test
    public void editarcombinacion8() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String priceString = "a";

        Combo r = new Combo();

        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Precio debe ser un numero entero positivo");

        r.setPrice(priceString);
    }

    @Test
    public void editarcombinacion9() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String yogurtString = "a";

        Combo r = new Combo();

        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");

        r.setvarYogurt(yogurtString);
    }

    @Test
    public void editarcombinacion10() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String fresaString = "a";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");

        r.setvarFresas(fresaString);
    }

    @Test
    public void editarcombinacion11() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String almendraString = "a";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");

        r.setvarAlmendras(almendraString);
    }

    @Test
    public void editarcombinacion12() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        ac1.agregarCombinacion1();

        String chocolateString = "a";

        Combo r = new Combo();
        iceMaker.editCombo(1, r);

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero positivo");

        r.setvarChocolate(chocolateString);
    }














}
