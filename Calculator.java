package com.wip.automation.exercise5;

public class Calculator {


  public void addition(int number1, int number2) {
    System.out.println("Addition is: " + (number1 + number2));

  }

  public void modulus(int number1, int number2) {
    System.out.println("Modulus is: " + (number1 % number2));

  }

  public int subtraction(int number1, int number2) {
    return number1 - number2;
  }


  public void multiplication(int number1, int number2) {
    System.out.println("multiplication is: " + (number1 * number2));

  }

  public void division(int number1, int number2) {
    System.out.println("division is: " + (number1 / number2));

  }

  public void square(int number1) {
    System.out.println("square is: " + (number1 * number1));

  }

}