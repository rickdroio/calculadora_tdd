package Calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	
	private Calculadora calc;
	
	@BeforeEach
	public void setUp() {
		this.calc = new Calculadora();
	}
	
	@Test
	void testSomarDoisInteiros() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.somar(a, b);
		
		assertEquals(a+b, resultado);
	}
	
	@Test
	void testSubtrairDoisInteiros() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.subtrair(a, b);
		
		assertEquals(a-b, resultado);
	}
	
	@Test
	void testMultiplicarDoisInteiros() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.multiplicar(a, b);
		
		assertEquals(a*b, resultado);
	}
	
	@Test
	void testDividirDoisInteiros() {
		
		//Calculadora calc = new Calculadora();
		
		int a = 3;
		int b = 2;
		int resultado = calc.dividir(a, b);
		
		assertEquals(a/b, resultado);
	}
	
	@Test
	void testDeveRetornarExceptionQuandoDividePorZero() {
		
		int a = 5;
		int b = 0;
		
		try {
			calc.dividir(a, b);
			fail("TESTE FALHOU: não retornou a Exception!");
		} catch (Exception e) {
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}
	
	@Test
	void testDeveRetornarExceptionUsandoLambda() {
		
		int a = 5;
		int b = 0;
		
		assertThrows(ArithmeticException.class, () -> calc.dividir(a, b));
	}
	
	@Test
	void testMediaComDoisNumeros() {
		
		int a = 6;
		int b = 4;
		
		float resultado = calc.mediaComDoisNumeros(a, b);
		
		assertEquals(5, resultado);
	}
	
	@Test
	void testMediaComVariosNumeros() {
		
		int[] numeros = {1, 3, 6, 5};
		
		float resultado = calc.mediaComVariosNumeros(numeros);
		
		assertEquals(15f/4f, resultado);
	}

}
