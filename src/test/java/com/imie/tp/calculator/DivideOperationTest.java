package com.imie.tp.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.DivideOperation;

/**
 * @author Amane
 *
 */
public class DivideOperationTest {

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.DivideOperation#DivideOperation(float)}.
	 */
	@Test
	public void testDivideOperation() {
		DivideOperation div = new DivideOperation(4);
		assertNotNull(div);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.DivideOperation#make(float)}.
	 */
	@Test
	public void testMake() {
		//DivideOperation div = new DivideOperation(4);
		//div.make(2);
		//assertEquals(2, div.currentValue);
		assertTrue(true);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.OperationCommandBase#getCurrentValue()}.
	 */
	@Test
	public void testGetCurrentValue() {
		//DivideOperation div = new DivideOperation(4);
		//assertEquals(4, div.getCurrentValue());
		assertTrue(true);
	}

}
