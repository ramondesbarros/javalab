package javalab;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.javalab.Calculadora;

public class CalculadoraTeste {

	Calculadora calculadora;
	
	@Before
	public void init() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testeSoma() {
		
		Integer a = 2;
		Integer b = 3;
		
		Integer result = 5;

		Integer resp = calculadora.soma(a, b);
		 
		 assertEquals(result, resp);
		 
	}
}
