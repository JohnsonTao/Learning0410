package com.johnson.tao;

public class Calculator {
	private final static int PLUS = 1;
	private final static int MINUS = 2;
	private final static int MULTIPLY = 3;
	private final static int DIVIDE = 4;
	
    public int calculate(int opt, int num1, int num2) {
    	int ret = 0;
    	switch (opt) {
		case PLUS:
			ret = num1 + num2;
			break;
		case MINUS:
			ret = num1 - num2;
			break;
		case MULTIPLY:
			ret = num1 * num2;
			break;
		case DIVIDE:
			ret = num1 / num2;
			break;			
		default:
			break;
		}
        return ret;
    }

  
}
