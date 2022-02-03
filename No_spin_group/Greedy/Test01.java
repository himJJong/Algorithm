package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    int n = sc.nextInt();
    int [] arr = new int[n];
    int [] sum = new int[n];

    for(int i=0; i<arr.length ; i++){
      sum[i] = arr[i]*(arr.length-i);
      result+=sum[i];
    }
    System.out.println(result);
  }
}

//백준 atm 문제
