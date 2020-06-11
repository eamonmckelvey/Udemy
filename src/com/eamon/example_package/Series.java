package com.eamon.example_package;

public class Series {


    public static int nSum(int n){

        int sum = 0;
        for(int i = 0; i<=n; i++){

             sum += i;

             //System.out.println(sum);


        }

        System.out.println(sum);
        return 0;
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 2; i <= n; i++) {

                product = product * i;
                //System.out.println(product);

            }

            System.out.println(product);
            return 0;
        }

    }


    public static int fibonacci(int n){

        // t1 = 1
        int t1 = 0;

        // t2 = 1
        int t2 = 1;
        for (int i =1; i<=n; i++){

            // print 0
            System.out.print(t1 + " + ");

            // sum = 0 + 1
            int sum = t1+t2;

            // t1 = 1
            t1 = t2;

            // t2 = 1
            t2 = sum;


        }

       // System.out.println(fibbo);
        return 0;
    }
}
