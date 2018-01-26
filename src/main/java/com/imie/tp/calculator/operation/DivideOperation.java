package com.imie.tp.calculator.operation;

/**
 * Class divide
 * @author Amane
 *
 */
public class DivideOperation extends OperationCommandBase {

	/**
	 * Constructor
	 * @param baseValue base value
	 */
	public DivideOperation(float baseValue) {
		super(baseValue);
	}

	@Override
	public void make(float value) {
		if(value == 0) {} else {
			this.currentValue /= value;
		}
	}
}
