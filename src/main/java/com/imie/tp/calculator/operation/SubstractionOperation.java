package com.imie.tp.calculator.operation;

/**
 * Class substraction
 * @author Amane
 *
 */
public class SubstractionOperation extends OperationCommandBase{
	
	/**
	 * Constructor
	 * @param baseValue base value
	 */
	public SubstractionOperation(float baseValue) {
		super(baseValue);
	}

	@Override
    public void make(float value) {
		this.currentValue -= value;
    }
}
