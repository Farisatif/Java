/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Zeref
 */
public class ForLoopWithVariables {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int product;
// The counter variable, num is declared inside the for loop
for (int num = 1; num <= 5; num++) {
product = num * 10;;
System.out.printf("\n % d * 10 = % d ", num, product);
} // End of the for loop
}
}