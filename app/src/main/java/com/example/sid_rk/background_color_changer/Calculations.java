package com.example.sid_rk.background_color_changer;



/**
 * Created by Sid-rk on 5/16/2017.
 */

public class Calculations {
    private boolean firstNum;
    private char operation;
    private String num1;
    private String num2;
    public Calculations(){
        num1="";
        num2="";
        operation='n';
        firstNum=true;
    }

    public String numDisplay(){
        if(firstNum&&operation=='n'){
            return num1+"";
        }
        else if(!firstNum&&num2=="0"){
            return num1+" "+operation;
        }
        else {
            return num1 + " " + operation + " " + num2;
        }
    }
    public void numInput(String num){
        if(firstNum){
            num1=num;
        }
        else {
            num2=num;
        }
    }

    public void operationsInput(char opr){
        operation=opr;
        firstNum=false;
    }
    public String calculator(){
        if(operation=='+'){
            return Double.toString(Double.parseDouble(num1)+Double.parseDouble(num2));
        }
        else if(operation=='-'){
            return Double.toString(Double.parseDouble(num1)-Double.parseDouble(num2));
        }
        else if(operation=='*'){
            return Double.toString(Double.parseDouble(num1)*Double.parseDouble(num2));
        }
        else if(operation=='/'&&Double.parseDouble(num2)==0){
            return "Error";
        }
        else if(operation=='/'&&Double.parseDouble(num2)!=0){
            return Double.toString(Double.parseDouble(num1)/Double.parseDouble(num2));
        }
        return "0";

    }
    public void clearAndReset(){
        num1="";
        num2="";
        operation='n';
        firstNum=true;
    }
}

