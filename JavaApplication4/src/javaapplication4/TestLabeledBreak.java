/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Zeref
 */
public class TestLabeledBreak {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int i;
outer:
for (i = 0; i < 5; i++) {
if (i == 2) {
System.out.println("Hello");
// Break out of outer loop
break outer; }
System.out.println("This is the outer loop.");
}
System.out.println("Good - Bye");
}
}