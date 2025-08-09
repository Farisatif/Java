package assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose program number to run:");
            System.out.println("1) Even or Odd");
            System.out.println("2) Positive or Negative");
            System.out.println("3) Smallest and Largest of 3 numbers");
            System.out.println("4) Quotient and Remainder");
            System.out.println("5) Sum and Average of 3 numbers");
            System.out.println("6) Vowel or Consonant");
            System.out.println("7) Count digits in number");
            System.out.println("8) Reverse number");
            System.out.println("=======================================");
            System.out.println("Enter 0 to exit.");

            System.out.print("Enter choice (1-8): ");
            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 0 and 8.");
                input.nextLine(); // clear invalid input
                continue;
            }

            int choice = input.nextInt();
            input.nextLine(); // clear newline

            if (choice == 0) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        if (num % 2 == 0) {
                            System.out.println("The number is even.");
                        } else {
                            System.out.println("The number is odd.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                    }
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        if (num >= 0) {
                            System.out.println("The number is positive.");
                        } else {
                            System.out.println("The number is negative.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                    }
                    input.nextLine();
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int num1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int num2 = input.nextInt();

                    System.out.print("Enter third number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int num3 = input.nextInt();

                    int smallest = Math.min(num1, Math.min(num2, num3));
                    int largest = Math.max(num1, Math.max(num2, num3));

                    System.out.println("Smallest number is: " + smallest);
                    System.out.println("Largest number is: " + largest);
                    input.nextLine();
                    break;

                case 4:
                    System.out.print("Enter dividend: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int dividend = input.nextInt();

                    System.out.print("Enter divisor: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int divisor = input.nextInt();

                    if (divisor == 0) {
                        System.out.println("Error! Division by zero is undefined.");
                        input.nextLine();
                        break;
                    }

                    System.out.println("Quotient = " + (dividend / divisor));
                    System.out.println("Remainder = " + (dividend % divisor));
                    input.nextLine();
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int n1 = input.nextInt();

                    System.out.print("Enter second number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int n2 = input.nextInt();

                    System.out.print("Enter third number: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    int n3 = input.nextInt();

                    int sum = n1 + n2 + n3;
                    double avg = sum / 3.0;

                    System.out.println("Sum = " + sum);
                    System.out.println("Average = " + avg);
                    input.nextLine();
                    break;

                case 6:
                    System.out.print("Enter a letter: ");
                    String s = input.nextLine();
                    if (s.length() == 1 && Character.isLetter(s.charAt(0))) {
                        char ch = Character.toLowerCase(s.charAt(0));
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            System.out.println(ch + " is a vowel.");
                        } else {
                            System.out.println(ch + " is a consonant.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a single letter.");
                    }
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    if (!input.hasNextLong()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    long number = input.nextLong();
                    long temp = Math.abs(number);
                    int count = 0;
                    if (temp == 0) count = 1;
                    while (temp > 0) {
                        temp /= 10;
                        count++;
                    }
                    System.out.println("Count of digits = " + count);
                    input.nextLine();
                    break;

                case 8:
                    System.out.print("Enter a number: ");
                    if (!input.hasNextLong()) {
                        System.out.println("Invalid input! Please enter an integer.");
                        input.nextLine();
                        break;
                    }
                    long num = input.nextLong();
                    long reversed = 0;
                    long t = Math.abs(num);
                    while (t > 0) {
                        reversed = reversed * 10 + t % 10;
                        t /= 10;
                    }
                    if (num < 0) reversed = -reversed;
                    System.out.println("Reversed number = " + reversed);
                    input.nextLine();
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number from 0 to 8.");
            }
        }

        input.close();
    }
}
