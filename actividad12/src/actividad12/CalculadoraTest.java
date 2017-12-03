/**
 * 
 */
package actividad12;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author casa
 *
 */
public class CalculadoraTest {

	private Calculadora calc34;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calc34 = new Calculadora(3,4);
	}

	/**
	 * Test method for {@link actividad12.Calculadora#Calculadora(int, int)}.
	 */
	@Test
	public void testCalculadora() {
		Calculadora calcLocal = new Calculadora(2,2);
		assertEquals(1,calcLocal.getNum1());
		assertEquals(2,calcLocal.getNum2());
	}

	/**
	 * Test method for {@link actividad12.Calculadora#suma()}.
	 */
	@Test
	public void testSuma() {
		int resulSumaReal = calc34.suma();
		int resulSumaEsparado = 7;
		assertEquals(resulSumaEsparado,resulSumaReal);
	}

	/**
	 * Test method for {@link actividad12.Calculadora#resta()}.
	 */
	@Test
	public void testResta() {
		int resulRestaReal = calc34.resta();
		int resulRestaEsparado = -1;
		assertEquals(resulRestaEsparado,resulRestaReal);
	}

	/**
	 * Test method for {@link actividad12.Calculadora#multiplica()}.
	 */
	@Test
	public void testMultiplica() {
		int resulMultiplicaReal = calc34.multiplica();
		int resulMultiplicaEsparado = 12;
		assertEquals(resulMultiplicaEsparado,resulMultiplicaReal);
	}

	/**
	 * Test method for {@link actividad12.Calculadora#divide()}.
	 */
	@Test
	public void testDivide() {
		int resulDivideaReal = calc34.divide();
		int resulDivideEsparado = 0;
		assertEquals(resulDivideEsparado,resulDivideaReal);
	}

}
