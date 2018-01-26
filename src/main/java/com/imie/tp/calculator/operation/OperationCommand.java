package com.imie.tp.calculator.operation;

/**
 * Interface which contains the methods tu use for an operation
 * @author Amane
 *
 */
public interface OperationCommand {

	/**
	 * Operation to do
	 * @param value operand
	 */
    void make(float value);

    /**
     * Get the current value (result)
     * @return the current value (result)
     */
    float getCurrentValue();
}
