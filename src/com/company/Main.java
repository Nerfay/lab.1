package com.company;

public class Main {

    public static void main(String[] args) {
          task26();
          task51();
          task76();
          task101();
          task126();
    }
    private static void task26(){
        int n = (int) (Math.random() * 10 + 1);
        float k= 1.0F;
        for (int i = 2; i <= 2*n ; i+=2) {
            k*=(float) i/(i+1);
        }
        System.out.println(k+"\nn="+n);
    }
    private static void task51(){

    }
    private static void task76(){

    }
    private static void task101(){

    }
    private static void task126(){

    }
}
