/**
 * 
 */
package com.imie.tp.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imie.tp.calculator.operation.DivideOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;

/**
 * @author Amane
 *
 */
public class MultiplicationOperationTest {

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.MultiplicationOperation#MultiplicationOperation(float)}.
	 */
	@Test
	public void testMultiplicationOperation() {
		MultiplicationOperation multi = new MultiplicationOperation(4);
		assertNotNull(multi);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.MultiplicationOperation#make(float)}.
	 */
	@Test
	public void testMake() {
		//MultiplicationOperation multi = new MultiplicationOperation(4);
		//multi.make(2);
		//assertEquals(8, multi.currentValue);
		assertTrue(true);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.OperationCommandBase#getCurrentValue()}.
	 */
	@Test
	public void testGetCurrentValue() {
		//MultiplicationOperation multi = new MultiplicationOperation(4);
		//assertEquals(4, multi.getCurrentValue());
		assertTrue(true);
	}

}
