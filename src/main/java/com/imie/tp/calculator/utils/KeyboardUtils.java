package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * Class utilitary
 * @author Amane
 *
 */
public final class KeyboardUtils {

	/**
	 * Read an integer from the keyboard and return it
	 * @param displayAsk String to display
	 * @return integer entered
	 */
    public static int readInt(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(displayAsk);
        int result = keyboard.nextInt();
        keyboard.nextLine();
        return result;
    }
    
    /**
	 * Read a float from the keyboard and return it
	 * @param displayAsk String to display
	 * @return float entered
	 */
    public static float readFloat(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(displayAsk);
        float result = keyboard.nextFloat();
        keyboard.nextLine();
        return result;
    }
}
