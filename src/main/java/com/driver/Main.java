package com.driver;

public class Main {
  
  public class Product{
    public int product(int x, int y) {}
    public int product(int x, int y, int z) {}
     public double product(double x, double y) {} 
  }
  public static void main(String[] args){
      Product p=new Product();
       p.product(2,3);
       p.product(2,4,5);
       p.product(2.45,3.56);
   }

}
