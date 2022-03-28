package com.company;

public class Main {

    public static void main(String[] args) {
        task26();
        task51();
        task76();
        task101();
        task126();
    }

    /**
     * task26) Дано натуральное число n. Вычислить произведение первых n сомножителей P=2/3+4/5+6/7...2n/(2n+1).
     */
    private static void task26() {
        int n = (int) (Math.random() * 10 + 1);
        float k = 1.0F;
        for (int i = 2; i <= 2 * n; i += 2) {
            k *= (float) i / (i + 1);
        }
        System.out.println(k + "\nn=" + n);
    }

    /**
     * task51) Дано натуральное число n. Найти сумму n^2+(n+1)^2+...+(2n)^2.
     */
    private static void task51() {
        int n = (int) (Math.random() * 10 + 1);
        int k = 0;
        for (int i = n; i <= 2 * n; i++) {
            k += (i * i);
        }
        System.out.println(k + "\nn=" + n);
    }

    /**
     * task76) Дано натуральное число n, вычислить: a)1/sin 1+1/(sin 1+sin 2)+...+1/(sin 1+...+sin n) б)cos 1/sin 1 + (cos 1+ cos 2)/(sin 1 + sin 2)+...+(cos 1 +...+ cos n)/(sin 1 +...+ sin n).
     */
    private static void task76() {
        int n = (int) (Math.random() * 10 + 1);
        double sum_a = 0;
        double denominator_sin = 0;
        double denominator_cos = 0;
        double sum_b = 0;
        for (int i = 1; i <= n; i++) {
            denominator_sin += Math.sin(i);
            denominator_cos += Math.cos(i);
            sum_a += 1 / denominator_sin;
            sum_b += denominator_cos / denominator_sin;
        }
        System.out.println(sum_a);
        System.out.println(sum_b + "\nn=" + n);
    }

    /**
     * task101) Известны оценки за контрольную работу по физике каждого ученика двух классов. Определить, сколько оценок «отлично», «хорошо», «удовлетворительно» и «неудовлетворительно» было выставлено в каждом классе. Количество учащихся в каждом классе одинаковое.
     */
    private static void task101() {
        int n = 28;
        int max_2 = 0;
        int max_3 = 0;
        int max_4 = 0;
        int max_5 = 0;
        for (int i = 1; i <= 28; i++) {
            int k = (int) (Math.random() * 4 + 2);
            if (k == 2) {
                max_2++;
            }
            if (k == 3) {
                max_3++;
            }
            if (k == 4) {
                max_4++;
            }
            if (k == 5) {
                max_5++;
            }
        }
        System.out.println("Первый класс :");
        System.out.println("неудовлетворительно = " + max_2);
        System.out.println("удовлетворительно = " + max_3);
        System.out.println("хорошо = " + max_4);
        System.out.println("отлично = " + max_5);
        max_2 = 0;
        max_3 = 0;
        max_4 = 0;
        max_5 = 0;
        for (int i = 1; i <= 28; i++) {
            int k = (int) (Math.random() * 4 + 2);
            if (k == 2) {
                max_2++;
            }
            if (k == 3) {
                max_3++;
            }
            if (k == 4) {
                max_4++;
            }
            if (k == 5) {
                max_5++;
            }
        }
        System.out.println("\n\nВторой класс :");
        System.out.println("неудовлетворительно = " + max_2);
        System.out.println("удовлетворительно = " + max_3);
        System.out.println("хорошо = " + max_4);
        System.out.println("отлично = " + max_5);
    }

    /**
     * task126) Вывести на экран календарь на текущий год.
     */
    private static void task126() {
        int l = 5;
        System.out.println("2022");
        System.out.println("\t\tЯнварь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tФевраль");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <= 28; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tМарт");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tАпрель");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t");
        for (int k = 1; k <= 30; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tМай");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tИюнь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t");
        for (int k = 1; k <= 30; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tИюль");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tАвгуст");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tСентябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t");
        for (int k = 1; k <= 30; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tОктябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t\t\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tНоябрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t");
        for (int k = 1; k <= 30; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
        System.out.println("\n ");
        System.out.println("\t\tДекабрь");
        System.out.println("Пн\tВт\tСр\tЧт\tПт\tСб\tВс");
        System.out.print("\t\t\t");
        for (int k = 1; k <= 31; k++) {
            System.out.print(k + "\t");
            l++;
            if (l == 7) {
                System.out.println();
                l = 0;
            }
        }
    }
}
