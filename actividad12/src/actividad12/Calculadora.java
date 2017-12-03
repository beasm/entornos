/**
 * Clase Calculadora
 * 
 * Version Alpha 0.0.1
 * 
 * Copyright Beatriz Soria Matilla
 * 
 * Esta clase simula una calculadora
 * 
 * @author Beatriz Soria Matilla
 */
package actividad12;

/**
 * 
 * Prueba de realiza un cambio en tu código y añádelo al repositorio.
 * 
 * @author Beatriz Soria Matilla
 *
 */
public class Calculadora {
	private int num1;
	private int num2;
	
	/**
	 * constructor
	 * 
	 * @param a int
	 * @param b int 
	 */
	public Calculadora(int a, int b) {
		super();
		this.num1 = a;
		this.num2 = b;
	}
	
	/**
	 * devuelve num1
	 * 
	 * @return num1 int
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * asigna el num1
	 * 
	 * @param num1 int
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	 * devuelve num2
	 * 
	 * @return num2 int
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * asigna el num2
	 * 
	 * @param num2 int
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	/**
	 * suma num1 y num2
	 * 
	 * @return result int
	 */
	public int suma() {
		int result = num1 + num2;
		return result;
	}
	
	/**
	 * resta num1 menos num2
	 * 
	 * @return result int
	 */
	public int resta() {
		int result = num1 - num2;
		return result;
	}
	
	/**
	 * multiplica num1 y num2
	 * 
	 * @return result int
	 */
	public int multiplica() {
		int result = num1 * num2;
		return result;
	}
	
	/**
	 * divide num1 y num2
	 * 
	 * @return result int
	 */
	public int divide() {
		int result = num1 / num2;
		return result;
	}
	
	/**
	 * si num1 es mayor que num2 devuelve true
	 * sino false
	 * 
	 * @return boolean
	 */
	public boolean resta2() {
		if(num1>=num2) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * divide num1 y num2
	 * o devuelve null si num2 es 0
	 * 
	 * @return result Integer
	 */
	public Integer divide2() {
		if(num2==0) {
			return null;
		}
		int resul = num1/num2;
		return resul;
	}

}
