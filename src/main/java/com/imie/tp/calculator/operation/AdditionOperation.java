package com.imie.tp.calculator.operation;

/**
 * Class addition
 * @author Amane
 *
 */
public class AdditionOperation extends OperationCommandBase {

	/**
	 * Constructor
	 * @param baseValue base value
	 */
    public AdditionOperation(float baseValue) {
		super(baseValue);
	}
    
	@Override
    public void make(float value) {
		this.currentValue += value;
    }
}
