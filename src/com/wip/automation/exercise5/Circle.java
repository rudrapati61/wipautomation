package com.wip.automation.exercise5;

public class Circle {
  public double radius;
  public double pi;
  public static int count =0;

  public Circle(double rad) {

    pi = 3.1421592;

    radius = rad;
    count++;
  }

  public double area() {
    return pi * radius * radius;

  }

  public double perimeter() {
    return pi * 2 * radius;

  }

  public double getRadius() {
    return radius;

  }

}
