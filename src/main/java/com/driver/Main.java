package com.driver;

public class Main {
  
  public class Product{
    public int product(int a, int b) {}
    public int product(int a, int b, int c) {}
     public double product(double a, double b) {}
  }
  public static void main(String[] args){
      Product p=new Product();
       p.product(2,3);
       p.product(2,4,5);
       p.product(2.45,3.56);
   }

}
