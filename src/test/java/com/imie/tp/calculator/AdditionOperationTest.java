/**
 * 
 */
package com.imie.tp.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.AdditionOperation;

/**
 * @author Amane
 *
 */
public class AdditionOperationTest {

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.AdditionOperation#AdditionOperation(float)}.
	 */
	@Test
	public void testAdditionOperation() {
		AdditionOperation add = new AdditionOperation(2);
		assertNotNull(add);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.AdditionOperation#make(float)}.
	 */
	@Test
	public void testMake() {
		AdditionOperation add = new AdditionOperation(2);
		add.make(3);
		assertEquals(5.0, add.currentValue, 0);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.OperationCommandBase#getCurrentValue()}.
	 */
	@Test
	public void testGetCurrentValue() {
		AdditionOperation add = new AdditionOperation(2);
		assertEquals(2, add.getCurrentValue(), 0);
	}
}
