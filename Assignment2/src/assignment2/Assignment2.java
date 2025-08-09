package assignment2;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n====== Choose a program number to run (9 - 17) ======");
            System.out.println("9  - Factorial of a number");
            System.out.println("10 - ASCII value of a character");
            System.out.println("11 - Count vowels and consonants");
            System.out.println("12 - Print string letters one by one");
            System.out.println("13 - Find length of word");
            System.out.println("14 - Get all numbers from string");
            System.out.println("15 - Get all letters from string");
            System.out.println("16 - Reverse a string");
            System.out.println("17 - Sum of two arrays");
            System.out.println("0  - Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");

            int choice = -1;
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // Clear newline
            } else {
                System.out.println("Please enter a valid number.");
                input.nextLine();
                continue;
            }

            switch (choice) {
                case 9: {
                    System.out.print("Enter a non-negative integer: ");
                    if (input.hasNextInt()) {
                        int num = input.nextInt();
                        if (num < 0) {
                            System.out.println("Number must be non-negative.");
                        } else {
                            long fact = 1;
                            for (int i = 1; i <= num; i++) {
                                fact *= i;
                            }
                            System.out.println("Fact = " + fact);
                        }
                    } else {
                        System.out.println("Invalid input. Enter a number.");
                        input.next(); // Clear
                    }
                    break;
                }

                case 10: {
                    System.out.print("Enter a single character: ");
                    String letter = input.nextLine();
                    if (letter.length() == 1) {
                        System.out.println("ASCII value = " + (int) letter.charAt(0));
                    } else {
                        System.out.println("Invalid input. Enter ONE character.");
                    }
                    break;
                }

                case 11: {
                    System.out.print("Enter a word or sentence: ");
                    String text = input.nextLine().toLowerCase();
                    int vowels = 0, consonants = 0;
                    for (char ch : text.toCharArray()) {
                        if (Character.isLetter(ch)) {
                            if ("aeiou".indexOf(ch) >= 0)
                                vowels++;
                            else
                                consonants++;
                        }
                    }
                    System.out.println("Count vowel = " + vowels);
                    System.out.println("Count consonant = " + consonants);
                    break;
                }

                case 12: {
                    System.out.print("Enter a word: ");
                    String word = input.nextLine();
                    System.out.print("Output: ");
                    for (char ch : word.toCharArray()) {
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                    break;
                }

                case 13: {
                    System.out.print("Enter a word: ");
                    String word = input.nextLine();
                    System.out.println("Word length = " + word.length());
                    break;
                }

                case 14: {
                    System.out.print("Enter a string with numbers: ");
                    String str = input.nextLine();
                    String numbers = str.replaceAll("[^0-9]", "");
                    System.out.println("Numbers = " + numbers);
                    break;
                }

                case 15: {
                    System.out.print("Enter a string with letters and numbers: ");
                    String str = input.nextLine();
                    String letters = str.replaceAll("[^a-zA-Z]", "");
                    System.out.println("Letters = " + letters);
                    break;
                }

                case 16: {
                    System.out.print("Enter a word: ");
                    String text = input.nextLine();
                    String reversed = new StringBuilder(text).reverse().toString();
                    System.out.println("Reversed string = " + reversed);
                    break;
                }

                case 17: {
                    int[] arr1 = new int[2];
                    int[] arr2 = new int[2];
                    int[] sumArr = new int[2];

                    for (int i = 0; i < 2; i++) {
                        System.out.print("Enter element " + (i + 1) + " for array1: ");
                        if (input.hasNextInt()) {
                            arr1[i] = input.nextInt();
                        } else {
                            System.out.println("Invalid input.");
                            input.next(); // Clear
                            i--;
                            continue;
                        }
                    }

                    for (int i = 0; i < 2; i++) {
                        System.out.print("Enter element " + (i + 1) + " for array2: ");
                        if (input.hasNextInt()) {
                            arr2[i] = input.nextInt();
                        } else {
                            System.out.println("Invalid input.");
                            input.next(); // Clear
                            i--;
                            continue;
                        }
                    }

                    for (int i = 0; i < 2; i++) {
                        sumArr[i] = arr1[i] + arr2[i];
                    }

                    System.out.print("Sum array = { ");
                    for (int val : sumArr) {
                        System.out.print(val + " ");
                    }
                    System.out.println("}");
                    input.nextLine(); // Clean up
                    break;
                }

                case 0:
                    System.out.println("Exiting program.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
