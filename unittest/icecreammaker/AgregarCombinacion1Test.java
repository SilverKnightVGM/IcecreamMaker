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
public class AgregarCombinacion1Test {

    @Test
    public void agregarCombinacion1() {

        IcecreamMaker iceMaker = new IcecreamMaker();

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
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
            assertEquals(3, iceMaker.getCombos()[0].getvarYogurt());
            assertEquals(1, iceMaker.getCombos()[0].getvarFresas());
            assertEquals(1, iceMaker.getCombos()[0].getvarAlmendras());
            assertEquals(0, iceMaker.getCombos()[0].getvarChocolate());

        } catch (ComboException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void agregarCombinacion2() {

        IcecreamMaker iceMaker = new IcecreamMaker();
        this.agregarCombinacion1();

        String resultado = "";

        String name = "Batida";
        String priceString = "50";
        String yogurtString = "3";
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

            boolean ComboAdded = iceMaker.addCombo(r);
            if (ComboAdded) {
                resultado = name + " agregado exitosamente.";
            } else {
                resultado = name + " no pudo ser agregado.";
            }

            assertEquals("Batida no pudo ser agregado.", resultado);
            System.out.println(resultado);

        } catch (ComboException e) {
            System.out.println(e.getMessage());
        }

    }

    // Utilizados esto para poder obtener la exception que genera cuando se hace un input con algun numero negativo
    @Rule
    public final ExpectedException excepcion = ExpectedException.none();

    @Test
    public void agregarCombinacion3() throws ComboException {

        String priceString = "-50";

        Combo r = new Combo();

        //This is preparing to catch an exception being thrown after this
        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Precio debe ser un numero entero positivo");
        //setPrice throws exception so it passes
        r.setPrice(priceString);

    }

    // Aqui le mando un -50 y esto lo manda a la exccepcion - Otra manera de hacerle un test de junit al agregarCombinacion3
    @Test(expected = ComboException.class)
    public void agregarCombinacion3_2() throws ComboException {

        String priceString = "-50";
        Combo r = new Combo();

        r.setPrice(priceString);

    }

    @Test
    public void agregarCombinacion4() throws ComboException {

        String yogurtString = "-3";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");
        r.setvarYogurt(yogurtString);
    }

    @Test
    public void agregarCombinacion5() throws ComboException {

        String fresaString = "-2";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");
        r.setvarFresas(fresaString);
    }

    @Test
    public void agregarCombinacion6() throws ComboException {

        String almendraString = "-2";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");
        r.setvarAlmendras(almendraString);
    }

    @Test
    public void agregarCombinacion7() throws ComboException {

        String chocolateString = "-3";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero entero positivo");
        r.setvarChocolate(chocolateString);
    }

    @Test
    public void agregarCombinacion8() throws ComboException {

        String priceString = "a";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Precio debe ser un numero entero positivo");
        r.setPrice(priceString);

    }

    @Test
    public void agregarCombinacion9() throws ComboException {

        String yogurtString = "a";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Yogurt debe ser un numero entero positivo");
        r.setvarYogurt(yogurtString);
    }

    @Test
    public void agregarCombinacion10() throws ComboException {

        String fresaString = "a";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Fresas debe ser un numero entero positivo");
        r.setvarFresas(fresaString);
    }

    @Test
    public void agregarCombinacion11() throws ComboException {

        String almendraString = "a";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Almendras debe ser un numero entero positivo");
        r.setvarAlmendras(almendraString);
    }

    @Test
    public void agregarCombinacion12() throws ComboException {

        String chocolateString = "a";

        Combo r = new Combo();

        excepcion.expect(ComboException.class);
        excepcion.expectMessage("Unidades de Chocolate debe ser un numero positivo");
        r.setvarChocolate(chocolateString);
    }

    @Test
    public void agregarCombinacion13() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        this.agregarCombinacion1();

        String name = "Chococrema";
        String priceString = "60";
        String yogurtString = "3";
        String fresaString = "2";
        String almendraString = "2";
        String chocolateString = "3";

        Combo r = new Combo();

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
        r.setvarChocolate(chocolateString);

        iceMaker.addCombo(r);

        assertEquals("Chococrema", iceMaker.getCombos()[1].getName());
        assertEquals(60, iceMaker.getCombos()[1].getPrice());
        assertEquals(3, iceMaker.getCombos()[1].getvarYogurt());
        assertEquals(2, iceMaker.getCombos()[1].getvarFresas());
        assertEquals(2, iceMaker.getCombos()[1].getvarAlmendras());
        assertEquals(3, iceMaker.getCombos()[1].getvarChocolate());

    }

    @Test
    public void agregarCombinacion14() throws ComboException {

        IcecreamMaker iceMaker = new IcecreamMaker();
        this.agregarCombinacion13();

        String name = "Fresacrunch";
        String priceString = "60";
        String yogurtString = "3";
        String fresaString = "3";
        String almendraString = "2";
        String chocolateString = "0";

        Combo r = new Combo();

        r.setName(name);
        r.setPrice(priceString);
        r.setvarYogurt(yogurtString);
        r.setvarFresas(fresaString);
        r.setvarAlmendras(almendraString);
        r.setvarChocolate(chocolateString);

        iceMaker.addCombo(r);

        assertEquals("Fresacrunch", iceMaker.getCombos()[2].getName());
        assertEquals(60, iceMaker.getCombos()[2].getPrice());
        assertEquals(3, iceMaker.getCombos()[2].getvarYogurt());
        assertEquals(3, iceMaker.getCombos()[2].getvarFresas());
        assertEquals(2, iceMaker.getCombos()[2].getvarAlmendras());
        assertEquals(0, iceMaker.getCombos()[2].getvarChocolate());

    }

}
