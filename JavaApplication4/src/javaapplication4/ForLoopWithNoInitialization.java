/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Zeref
 */
public class ForLoopWithNoInitialization {
public static void main(String[] args) {
/*
* Counter variable declared and initialized outside for loop
*/
int num = 1;
/*
* Boolean variable initialized to false
*/
boolean flag = false;
/*
* The for loop starts with num value 1 and
* continues till value of flag is not true
*/
for (; !flag; num++) {
System.out.println("Value of num: " + num);
if (num == 5) {
flag = true;
}
} // End of for loop
}
}