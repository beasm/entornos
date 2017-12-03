/**
 * Clase CalcTestRestaParametrizada
 * 
 * Version Alpha 0.0.1
 * 
 * Copyright Beatriz Soria Matilla
 * 
 * Esta clase prueba parametrizada de la operacion multiplicacion de Calculadora
 * 
 * @author Beatriz Soria Matilla
 */
package actividad12;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Beatriz Soria Matilla
 *
 */
@RunWith(Parameterized.class)
public class CalcTestMultiplicaParametrizada {
	private int num1;
	private int num2;
	private int res;
	private Calculadora calc;
	
	/**
	 * constructor con variable que vamos a usar en la parametrizacion
	 * 
	 * @param num1
	 * @param num2
	 * @param res
	 */
	public CalcTestMultiplicaParametrizada(int num1, int num2, int res) {
		this.num1 = num1;
		this.num2 = num2;
		this.res = res;

	}

	/**
	 * Definomos los valores y lista de valores acorde al constructor
	 * 
	 * @return
	 */
	@Parameters
	public static Collection<Object[]> init(){
		
		return Arrays.asList(new Object[][] {{2,4,8},{4,5,20},{5,6,30}});
	}
	
	/**
	 * inicializamos los valores de num1 y num2 antes de probar
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora(num1,num2);
	}
	
	/**
	 * probamos que la multiplica es lo que esperamos
	 * 
	 * Test method for {@link actividad12.Calculadora#suma(}.
	 */
	@Test
	public final void test() {
		assertEquals(res,calc.multiplica());
	}
	
	/**
	 * probamos que la multiplica es lo que esperamos de forma local
	 * 
	 * Test method for {@link actividad12.Calculadora#suma()}.
	 */
	@Test
	public void testMultiplica() {
		Calculadora calcLocal = new Calculadora(num1,num2);
		int resulMultiplicaReal = calcLocal.multiplica();
		int resulMultiplicaEsparado = res;
		assertEquals(resulMultiplicaEsparado,resulMultiplicaReal);
	}

}
