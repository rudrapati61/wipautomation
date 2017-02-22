package com.wip.automation.training.exercise6;

import java.util.Arrays;

public class CountrySort {

  public static void main(String[] args) {

    String countryArray[] = {"Japan", "India", "USA", "Thailand", "Sri Lanka"};

    Arrays.sort(countryArray);
    System.out.println("Countries sorted list =" + Arrays.toString(countryArray));
  }
}
