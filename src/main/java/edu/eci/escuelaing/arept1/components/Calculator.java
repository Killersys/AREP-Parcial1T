package edu.eci.escuelaing.arept1.components;


public class Calculator {
    public static double trigonometriCalculation(String option,String number){
        double value = 0;
        switch (option){
        	case "cos":{
        		value = Math.cos(Double.parseDouble(number));
        		break;}
            case "sin":{
                value = Math.sin(Double.parseDouble(number));
                break;} 
            case "tan":{
                value = Math.tan(Double.parseDouble(number));
                break;}}

        return value;


    }
}
