/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Numbuer : ");
         String numInput = sc.next();
        if(numInput.matches("^[0-100]+$")){
        
            num = Integer.parseInt(numInput);
            System.out.println("Num = "+num);
            
        } else {
            
            System.out.println("Invalid Number !");
            
        }
         
    }
    
}
