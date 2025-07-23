/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//     
//        
//      
        Scanner scanner = new Scanner (System.in);
//             System.out.print("Enter Your First num : ");
//      byte first = scanner.nextByte();
//          System.out.print("Enter Your sec num : ");
//      byte sec = scanner.nextByte();
//          System.out.print("Enter Your Theerd num : ");
//      byte ther  = scanner.nextByte();
//      
//      
//              System.out.println("Sum is : "+(first+sec+ther)+"n And Your : "+((first+sec+ther)/3)  );
//            //  System.out.printf("The Sim = %f %n avg = %f",ther);
//              

           System.out.print("Enter Your First num : ");
     
      int num3;
      while(!scanner.hasNextInt()){
      
           System.out.println("Error !");
          scanner.next();
      }
      
      num3 = scanner.nextInt();
        if (num3 %  2 == 0) {
            System.out.println("Aven");
        }else{
            System.out.println("Odd");
        }
              
           //معالجه البيانات عشان اخطاء الرقم وال   
           
      // senshal 2
      //
      
      // TODO code application logic here
      
    }
    
}
