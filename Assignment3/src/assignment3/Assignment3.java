package assignment3;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Choose program number to run (18 - 24) ===");
            System.out.println("18 - Sum of all elements in an array");
            System.out.println("19 - Smallest and largest element in an array");
            System.out.println("20 - Sort array in ascending order");
            System.out.println("21 - Check if a number is prime");
            System.out.println("22 - Check if number is divisible by another");
            System.out.println("23 - Swap two numbers");
            System.out.println("24 - Sum of digits of a number");
            System.out.println("=========================================");
            System.out.println("0  - Exit");
            System.out.print("Enter your choice: ");

            int choice = -1;
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // clear buffer
            } else {
                System.out.println("Invalid input! Enter a number 0-24.");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 18: {
                    System.out.print("Enter number of elements in array: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int n = input.nextInt();
                    if (n <= 0) {
                        System.out.println("Number must be positive.");
                        input.nextLine();
                        break;
                    }
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    boolean valid = true;
                    for (int i = 0; i < n; i++) {
                        if (input.hasNextInt()) {
                            arr[i] = input.nextInt();
                        } else {
                            System.out.println("Invalid element input.");
                            input.nextLine();
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) break;
                    int sum = 0;
                    for (int val : arr) sum += val;
                    System.out.println("Sum all elements = " + sum);
                    input.nextLine();
                    break;
                }

                case 19: {
                    System.out.print("Enter number of elements in array: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int n = input.nextInt();
                    if (n <= 0) {
                        System.out.println("Number must be positive.");
                        input.nextLine();
                        break;
                    }
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    boolean valid = true;
                    for (int i = 0; i < n; i++) {
                        if (input.hasNextInt()) {
                            arr[i] = input.nextInt();
                        } else {
                            System.out.println("Invalid element input.");
                            input.nextLine();
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) break;
                    int smallest = arr[0];
                    int largest = arr[0];
                    for (int val : arr) {
                        if (val < smallest) smallest = val;
                        if (val > largest) largest = val;
                    }
                    System.out.println("Smallest = " + smallest);
                    System.out.println("Largest = " + largest);
                    input.nextLine();
                    break;
                }

                case 20: {
                    System.out.print("Enter number of elements in array: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int n = input.nextInt();
                    if (n <= 0) {
                        System.out.println("Number must be positive.");
                        input.nextLine();
                        break;
                    }
                    int[] arr = new int[n];
                    System.out.println("Enter " + n + " elements:");
                    boolean valid = true;
                    for (int i = 0; i < n; i++) {
                        if (input.hasNextInt()) {
                            arr[i] = input.nextInt();
                        } else {
                            System.out.println("Invalid element input.");
                            input.nextLine();
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) break;
                    Arrays.sort(arr);
                    System.out.print("Sorted array = { ");
                    for (int val : arr) {
                        System.out.print(val + " ");
                    }
                    System.out.println("}");
                    input.nextLine();
                    break;
                }

                case 21: {
                    System.out.print("Enter a number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num = input.nextInt();
                    if (num <= 1) {
                        System.out.println("Number is not prime.");
                        input.nextLine();
                        break;
                    }
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println("Number is prime.");
                    } else {
                        System.out.println("Number is not prime.");
                    }
                    input.nextLine();
                    break;
                }

                case 22: {
                    System.out.print("Enter number 1 (num1): ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num1 = input.nextInt();

                    System.out.print("Enter number 2 (num2): ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num2 = input.nextInt();

                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else if (num1 % num2 == 0) {
                        System.out.println("Number " + num1 + " is divided by number " + num2);
                    } else {
                        System.out.println("Number " + num1 + " is NOT divided by number " + num2);
                    }
                    input.nextLine();
                    break;
                }

                case 23: {
                    System.out.print("Enter num1: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num1 = input.nextInt();

                    System.out.print("Enter num2: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num2 = input.nextInt();

                    // swap
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;

                    System.out.println("After swap:");
                    System.out.println("num1 = " + num1);
                    System.out.println("num2 = " + num2);
                    input.nextLine();
                    break;
                }

                case 24: {
                    System.out.print("Enter a number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input.");
                        input.nextLine();
                        break;
                    }
                    int num = input.nextInt();
                    int sumDigits = 0;
                    int temp = Math.abs(num);
                    while (temp > 0) {
                        sumDigits += temp % 10;
                        temp /= 10;
                    }
                    System.out.println("Sum of digits = " + sumDigits);
                    input.nextLine();
                    break;
                }

                case 0:
                    System.out.println("Exiting program.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter number from 0 to 24.");
            }
        }
    }
}
