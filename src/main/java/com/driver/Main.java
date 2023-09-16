package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(5,3);
        double ans2 = p.product(5.0, 3.0);
        int ans3 = p.product(5,3,2);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.print(ans3);
    }
    public static class Product{

        public int product(int x, int y){
            return x * y;
        }
        public double product(double x, double y){
            return (x * y);
        }
        public int product(int x, int y, int z){
            return x * y * z;
        }
    }
}