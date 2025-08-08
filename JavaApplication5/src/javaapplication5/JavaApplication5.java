/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewClass s1 = new NewClass("");
        Scanner input = new Scanner(System.in);
        
        System.err.println("Enter Student ID :");
        String id = input.nextLine();

        System.err.println("Enter Student name :");
        String name = input.nextLine();
        
        System.err.println("Enter Student address :");
        String address = input.nextLine();
        
        System.err.println("Enter Student Age :");
        int age = input.nextInt();
        
        s1.id=id;
        s1.name=name;
        s1.address=address;
        s1.age=age;
        
        
        
        s1.printStudent();
        
    }
    
}
