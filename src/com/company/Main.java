package com.company;

public class Main {

    public static void main(String[] args) {
          //task26();
          //task51();
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
        int n = (int) (Math.random() * 10 + 1);
        int k= 0;
        for (int i = n; i <= 2*n ; i++) {
            k+= (i*i);
        }
        System.out.println(k+"\nn="+n);
    }
    private static void task76(){

    }
    private static void task101(){
       int n=28;
       int l=0;
        int m=0;
        int s=0;
        int j=0;
        for (int i = 1; i <=28 ; i++) {
            int k = (int) (Math.random() * 4 + 2);
            if(k==2) {
                l++;
            }
            if(k==3) {
                m++;
            }
            if(k==4) {
                s++;
            }
            if(k==5) {
                j++;
            }
        }
        System.out.println("Первый класс :");
        System.out.println("неудовлетворительно = "+l);
        System.out.println("удовлетворительно = "+m);
        System.out.println("хорошо = "+s);
        System.out.println("отлично = "+j);
         l=0;
         m=0;
         s=0;
         j=0;
        for (int i = 1; i <=28 ; i++) {
            int k = (int) (Math.random() * 4 + 2);
            if(k==2) {
                l++;
            }
            if(k==3) {
                m++;
            }
            if(k==4) {
                s++;
            }
            if(k==5) {
                j++;
            }
        }
        System.out.println("\n\nВторой класс :");
        System.out.println("неудовлетворительно = "+l);
        System.out.println("удовлетворительно = "+m);
        System.out.println("хорошо = "+s);
        System.out.println("отлично = "+j);
    }
    private static void task126(){

    }
}
