package com.copilot.github.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExamplesApplicationTests {

	Funciones funciones = new Funciones();

    @Test
    void testFibonacci() {
        assertEquals(0, funciones.fibonacci(0));
        assertEquals(1, funciones.fibonacci(1));
        assertEquals(1, funciones.fibonacci(2));
        assertEquals(2, funciones.fibonacci(3));
        assertEquals(3, funciones.fibonacci(4));
        assertEquals(5, funciones.fibonacci(5));
        assertEquals(8, funciones.fibonacci(6));
        assertEquals(13, funciones.fibonacci(7));
        assertEquals(21, funciones.fibonacci(8));
        assertEquals(34, funciones.fibonacci(9));
	}

	@Test
	void testFactorial() {
		assertEquals(1, funciones.factorial(0));
		assertEquals(1, funciones.factorial(1));
		assertEquals(2, funciones.factorial(2));
		assertEquals(6, funciones.factorial(3));
		assertEquals(24, funciones.factorial(4));
		assertEquals(120, funciones.factorial(5));
		assertEquals(720, funciones.factorial(6));
		assertEquals(5040, funciones.factorial(7));
		assertEquals(40320, funciones.factorial(8));
		assertEquals(362880, funciones.factorial(9));
	}
	
	@Test
	void testPalindrome() {
		assertEquals(1, funciones.palindrome("a"));
		assertEquals(1, funciones.palindrome("aa"));
		assertEquals(1, funciones.palindrome("aba"));
		assertEquals(1, funciones.palindrome("abba"));
		assertEquals(1, funciones.palindrome("abcba"));
		assertEquals(0, funciones.palindrome("ab"));
		assertEquals(0, funciones.palindrome("abc"));
		assertEquals(0, funciones.palindrome("abca"));
		assertEquals(0, funciones.palindrome("abbc"));
		assertEquals(0, funciones.palindrome("abcc"));
	}

	@Test
    void testCountWords() {
		assertEquals(true, funciones.countWords("hola mundo", "hola"));
	}
}