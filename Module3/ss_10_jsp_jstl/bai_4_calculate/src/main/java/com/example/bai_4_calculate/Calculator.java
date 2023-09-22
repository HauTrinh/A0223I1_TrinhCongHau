package com.example.bai_4_calculate;

public class Calculator {
    public  static  float calculator(float firstNumber, float secondNumber, char operator) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return  firstNumber - secondNumber;
            case '/':
                if(secondNumber != 0 ) {
                    return firstNumber / secondNumber;
                } else {
                    throw  new RuntimeException("Can't divide by zero");
                }
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Invalid operator");
        }
    }
}
