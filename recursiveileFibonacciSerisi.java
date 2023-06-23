package odevler;

import java.util.Scanner;

public class recursiveileFibomacciBulma {
// fibonacci sayı dizisi
// 1 1 2 3 5 8 13 22
// f(1) = 1
// f(2) = 1

// f(n) = f(n-1) + f(n-2)
// f(6) = f(5) + f(4)
// f(5) = f(4) + f(3)
// f(4) = f(3) + f(2)
// f(3) = f(2) + f(1)
    static int fib(int n){
        if (n==1 ||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
       // System.out.println(fib(5));// 5
       // System.out.println(fib(6));// 8
       // System.out.println(fib(7));// 13

        Scanner inp=new Scanner(System.in);
        System.out.print("SAYI GIRINIZ: ");
        int n1=inp.nextInt();
       // System.out.println(fib(n1));
        System.out.println(n1 + " haneli Fibonacci Serisi: ");
        for (int i = 1; i <= n1; i++) {
            System.out.print(fib(i) + " ");
        }

    }
}
