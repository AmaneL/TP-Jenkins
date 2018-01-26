package com.imie.tp.calculator.operation;

/**
 * Class operation
 * @author Amane
 *
 */
public abstract class OperationCommandBase implements OperationCommand {
	
	/**
	 * Constructor
	 * @param baseValue base value
	 */
	public OperationCommandBase(float baseValue)
	{
		this.currentValue = baseValue;
	}

	/**
	 * The current value
	 */
	public float currentValue = 10;
	
	@Override
	public float getCurrentValue() {
		return this.currentValue;
	}
}
