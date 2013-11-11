package com.dayOne;


public class Methods {

    public static boolean isPrime(int n) {  //exercise 040

        boolean prime = false;

        if (n == 2) {
            prime  = true;

        } else if (n >= 3) {

            for (int i = 2; i < n;i++)
                if(n % i != 0) {
                    prime = true;
                } else {
                    prime = false;
                    break;
                }
            }

        return prime;
    }

    public static void prime1000() {    //exercise

        for (int i = 0; i < 1001; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }

    }


    public static void multiply(int x, int y) {

        int result = 0;

        for (int i = 0; i < y; i++) {
            result = result + x;
        }

        System.out.println("The answer to " + x + " x " + y + " is: " + result);
    }

    public static void divide(int x, int y) {

        int counter = 0;
        int countUp = 0;


        if (x >= y) {
            while (countUp < x) {
                countUp = countUp + y;
                counter++;
            }

            if (countUp == x) {
                System.out.println(x + " divides into " + y + ", " + counter + " times exactly.");
            } else {
                System.out.println(x + " divides into " + y + ", " + (counter - 1) + " times. With a remainder of " + (x - (countUp - y)));
            }

        } else {
            System.out.println(x + " is smaller than " + y + " so this is not possible.");
        }


    }

    public static void sort(int x, int y, int z) {
        int a = 0;
        int b = 0;
        int c = 0;


        System.out.println("You entered " + x + ", " +  y + ", " + z);

        if (x >= y && x >= z) {
            c = x;

        } else if (x <= y && x >= z) {
            b = x;
        } else {
            a = x;
        }

        if (y >= c && y >= b && y >= c) {
            c = y;
        } else {
            b = y
        }


        System.out.println("And now in ascending order " + a + ", " +  b + ", " + c);





    }

}