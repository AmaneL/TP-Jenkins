package com.imie.tp.calculator.utils;

/**
 * Class to historize operations
 * @author Amane
 *
 */
public class HistoryManager {
	
	/**
	 * History of the operations
	 */
	public String history = "";
	
	/**
	 * Constructor
	 */
	public HistoryManager() {}
	
	/**
	 * Add an operation to the history
	 * @param line operation to add
	 */
	public void addToHistory(String line) {
		
	}
	
	/**
	 * Clear the history
	 */
	public void clearHistory() {
		this.history = "";
	}
	
	/**
	 * Get the history
	 * @return the history
	 */
	public String getHistory() {
		return this.history;
	}
}
