/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Zeref
 */
public class PrintMultiplesWithForLoop {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int num, product;
// The for Loop with all the three declaration parts
for (num = 1; num <= 5; num++) {
product = num * 10;;
System.out.printf("\n % d * 10 = % d ", num, product);
} // Moves the control back to the for loop
}
}