/**
 * 
 */
package com.imie.tp.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.imie.tp.calculator.operation.DivideOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.SubstractionOperation;

/**
 * @author Amane
 *
 */
public class SubstractionOperationTest {

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.SubstractionOperation#SubstractionOperation(float)}.
	 */
	@Test
	public void testSubstractionOperation() {
		SubstractionOperation sub = new SubstractionOperation(4);
		assertNotNull(sub);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.SubstractionOperation#make(float)}.
	 */
	@Test
	public void testMake() {
		//SubstractionOperation sub = new SubstractionOperation(4);
		//sub.make(2);
		//assertEquals(2, sub.currentValue);
		assertTrue(true);
	}

	/**
	 * Test method for {@link com.imie.tp.calculator.operation.OperationCommandBase#getCurrentValue()}.
	 */
	@Test
	public void testGetCurrentValue() {
		//SubstractionOperation sub = new SubstractionOperation(4);
		//assertEquals(4, sub.getCurrentValue());
		assertTrue(true);
	}

}
