/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apph1;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
 public class AreaOfCircle {
   /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {   
    // Declares constant variable
          final double PI = 3.14159;
          double radius;
          double area;
     // Calculates the value for the area variable
         
          System.out.println("Enter radius : ");
     
          Scanner sc = new Scanner(System.in);
          radius = sc.nextInt();
          String name = "Fares";
          int age = 300;
          System.out.printf("name : %s and Your Age is : %d%n",name,age);
           area = PI * radius * radius;
          
         System.out.println("Area of the circle is: " + area);
   }
 } 
