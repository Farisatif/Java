/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Zeref
 */
public class SumOfNumbers {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int num = 1, sum = 0;
/*
* The body of the loop is executed first, then the condition is evaluated
*/
do {
sum = sum + num;
num++;
} while (num <= 10);
// Prints the value of variable after the loop terminates
System.out.printf("Sum of 10 Numbers: %d\n", sum);
}
}