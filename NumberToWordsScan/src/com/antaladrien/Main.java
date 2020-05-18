package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter positive number:");

        int num = myObj.nextInt();
        System.out.println(num + " to words: ");
        numberToWords(num);
    }

    public static int getDigitCount(int number) {
        int digitCount = -1;

        if (number >= 0) {
            int count = 0;

            do {
                count++;
                number /= 10;
            } while (number != 0);

            digitCount = count;
        }
        return digitCount;
    }

    public static int reverse(int number) {

        int reverse = 0;
        int newNumber = number;

        if (newNumber < 0) {
            newNumber *= (-1);
        }

        while (newNumber > 0) {
            int lastDigit = (newNumber % 10);
            reverse *= 10;
            reverse += lastDigit;
            newNumber /= 10;
        }
        if (number < 0) {
            reverse *= (-1);
        }
        return reverse;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);

            do {
                int lastDigit = (reversedNumber % 10);

                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                reversedNumber /= 10;
            } while (reversedNumber > 0);

            if (getDigitCount(number) != getDigitCount(reverse(number))) {
                int count = getDigitCount(number) - getDigitCount(reverse(number));
                while (count > 0) {
                    System.out.println("Zero");
                    count--;
                }
            }
        }
    }
}
