

import java.util.*;

class Middle{

    public static void  Fib(int a, int b, int n){

        if(n == 0){ // means your N is the 0 return
            return;
        }

       int c = a + b;
       System.out.println(c);

       Fib(b, c, n-1);


    }

    public static void main(String args[]){

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int n = 4;

        Fib(a, b, n-2);
    }
}
