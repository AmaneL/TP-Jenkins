package com.imie.tp.calculator;

import com.imie.tp.calculator.operation.AdditionOperation;
import com.imie.tp.calculator.operation.DivideOperation;
import com.imie.tp.calculator.operation.MultiplicationOperation;
import com.imie.tp.calculator.operation.OperationCommandBase;
import com.imie.tp.calculator.operation.SubstractionOperation;
import com.imie.tp.calculator.utils.HistoryManager;
import com.imie.tp.calculator.utils.KeyboardUtils;

public class Application {

	final static String MENU = "Type of Operation :\n- 1 : Addition\n- 2 : Substraction\n"
			+ "- 3 : Divide\n- 4 : Multiplication\n- 5 : Display History\n- 9 : Quit";
	
    public static void main(String[] args) {

    	boolean over = false;
    	HistoryManager history = new HistoryManager();
    	OperationCommandBase operation;
    	while(!over) {
    		try {
        		int choice = KeyboardUtils.readInt(MENU);
        		switch(choice) {
        		case 1 :
        		case 2 :
        		case 3 :
        		case 4 :
        			float a = KeyboardUtils.readFloat("Enter Value a : ");
        			OperationCommandBase ocb = chooseOperation(choice, a);
        			float b = KeyboardUtils.readFloat("Enter Value b : ");
        			if(choice == 3 && b == 0) {
        				System.out.println("Error : Division by zero forbidden");
        			} else {
        				String result = a + " " + getOperationCharacter(ocb) + " " + b + " = ";
        				ocb.make(b);
        				result += ocb.getCurrentValue() + "\n";
        				history.addToHistory(result);
        				System.out.println("Result : " + ocb.getCurrentValue());
        			}
        			break;
        		case 5 :
        			System.out.println("\nHistory :\n" + history.getHistory());
        			break;
        		case 9 :
            		over = true;
        			break;
        		default :
        			System.out.println("Ce choix n'existe pas");
        		}
    		} catch (NumberFormatException ex) {
    			System.out.println("Valeur entrée incorrecte !");
    		}
    	}
        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        // If enter 9 => Quit application
    }
    
    /**
     * Create an operation
     * @param op operation to create
     * @return the operation
     */
    public static OperationCommandBase chooseOperation(int op, float a) {
    		OperationCommandBase ocb = null;
    		switch(op) {
    		case 1:
    			ocb = new AdditionOperation(a);
    			break;
    		case 2:
    			ocb = new SubstractionOperation(a);
    			break;
    		case 3:
    			ocb = new DivideOperation(a);
    			break;
    		case 4:
    			ocb = new MultiplicationOperation(a);
    			break;
    		default:
    		}
    		return ocb;
    }
    
    //TODO
    public static Character getOperationCharacter(OperationCommandBase ocb) {
    		Character op = null;
    		if(ocb instanceof AdditionOperation) {
    			op = '+';
    		} else if (ocb instanceof SubstractionOperation) {
    			op = '-';
    		} else if (ocb instanceof DivideOperation) {
    			op = '/';
    		} else {
    			op = '*';
    		}
    		return op;
    }
}
