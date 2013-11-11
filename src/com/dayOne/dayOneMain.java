package com.dayOne;

    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// This is the main program where the user inputs are taken
        Scanner userInput = new Scanner(System.in);
        Boolean ended = false;
        System.out.println("\nThere are a choice of programs to run from day 1 of Java Programming.");
        System.out.println("Some require inputs, others will just print things out...");


        do {

            System.out.println("\n1 - To find out if a number is prime.");
            System.out.println("2 - To print all the prime numbers up to 1000.");
            System.out.println("3 - To multiply two numbers together.");
            System.out.println("4 - To divide one number by another.");
            System.out.println("5 - To enter a string with three numbers and get them in order.");
            System.out.println("0 - Will exit the program.");
            System.out.println("\nNow please choose an option: ");
            int x = 0;
            int y = 0;
            int z = 0;
            int tempInt = 0;
            String tempStr = "";
            boolean prime = false;
            String userEntry = "Nothing entered.";

            int choice = Integer.parseInt(userInput.next());
            switch(choice){
                case 1:
                    System.out.println("Please enter the number you wish to do a prime test on: ");
                    userEntry = userInput.next();
                    prime = Methods.isPrime(Integer.parseInt(userEntry));
                        if (prime) {
                            System.out.println(userEntry + " is a prime number.");
                        } else {
                            System.out.println(userEntry + " is not a prime number.");
                        }

                    break;
                case 2:
                    Methods.prime1000();
                    break;
                case 3:
                    System.out.println("Please enter the first number and press enter: ");

                    x = Integer.parseInt(userInput.next());
                    System.out.println("Now enter the second number you wish to multiply by and press enter: ");

                    y = Integer.parseInt(userInput.next());
                    Methods.multiply(x, y);
                    break;
                case 4:
                    System.out.println("Please enter the first number and press enter: ");

                    x = Integer.parseInt(userInput.next());
                    System.out.println("Now enter the second number you wish to divide by and press enter: ");

                    y = Integer.parseInt(userInput.next());
                    Methods.divide(x, y);
                    break;
                case 5:
                    System.out.println("Please enter three numbers, separated by commas, and this will sort them for you: ");
                    userEntry = userInput.next();

                        for(int i = 0; i < userEntry.length(); i++) {
                            if (Character.isDigit(userEntry.charAt(i))) {
                                tempStr = tempStr + userEntry.charAt(i);
                            } else {
                                if (x == 0){
                                x = Integer.parseInt(tempStr);
                                tempStr = "";
                                } else if (y == 0){
                                    y = Integer.parseInt(tempStr);
                                    tempStr = "";
                                }
                            }
                        }
                    z = Integer.parseInt(tempStr);
                    Methods.sort(x, y, z);
                    break;
                case 0:
                    System.out.println("You have exited the program.");
                    ended = true;
                    break;
                default:
                    System.out.println("That was not an option...");
                    break;
            }

        } while (!ended);












        // FOR TESTING METHODS.

        //Methods.isPrime(7);
        //Methods.isPrime(20);
        //Methods.isPrime(241);
        //Methods.isPrime(242);
        //Methods.isPrime(199);
        //Methods.isPrime(2);
        //Methods.isPrime(1);

        //Methods.prime1000();

        //Methods.multiply(4,7);
        //Methods.divide(20,4);
        //Methods.divide(41,4);

        //Methods.divide(12, 24);
        //Methods.divide(5, 5);
        //Methods.sort(5,6,7);
    }
}
