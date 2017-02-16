package com.wip.automation.exercise5;

public class CircleRadius {
public int radius;

  public CircleRadius(int rad) {
  
    radius = rad;
  }
  
  public void area() {
    System.out.println("Area of the circle is: " + (3.1421592 * radius * radius));

  }

  public void perimeter() {
    System.out.println("Perimeter of the circle is: " + (3.1421592 * 2 * radius));

  }

  public int getRadius() {
    return radius;

  }

}