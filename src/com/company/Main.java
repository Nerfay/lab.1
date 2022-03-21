package com.company;

public class Main {

    public static void main(String[] args) {
          //task26();
          //task51();
          //task76();
          //task101();
          //task126();
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
    private static void task76() {
        int n = (int) (Math.random() * 10 + 1);
        double k= 0;
        double a= 0;
        double m=0;
        double v=0;
        for (int i = 1; i <= n ; i++) {
            a+=Math.sin(i);
            m+=Math.cos(i);
            k+=1/a;
            v+=m/a;
        }
        System.out.println(k);
        System.out.println(v+"\nn="+n);
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
        int l=5;
        System.out.println("2022");
        System.out.println("\t\tЯнварь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t");
                for (int k = 1; k <=31 ; k++) {
                    System.out.print( k +"\t");
                    l++;
                    if(l==7){
                        System.out.println();
                        l=0;
                    }
                }
        System.out.println("\n ");
        System.out.println("\t\tФевраль");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <=28 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tМарт");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tАпрель");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t");
        for (int k = 1; k <=30 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tМай");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t\t");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tИюнь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t");
        for (int k = 1; k <=30 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tИюль");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tАвгуст");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tСентябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t");
        for (int k = 1; k <=30 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tОктябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tНоябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <=30 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }System.out.println("\n ");
        System.out.println("\t\tДекабрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t");
        for (int k = 1; k <=31 ; k++) {
            System.out.print( k +"\t");
            l++;
            if(l==7){
                System.out.println();
                l=0;
            }
        }
    }
}
