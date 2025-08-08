/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Zeref
 */
public class NewClass {
    
    String id = "300ID",
           name="Zeref",
           address="0101";
    
    int age = 1_000_000;
    
    public NewClass(){
    
        System.err.println("Con");
    
    }
    
    public NewClass(String id){
    
        this.id=id;
        System.out.println("id");
    
    }
    
    void printStudent(){
    
         System.out.println("Student id is : "+id);
         System.out.println("Student Name is : "+name);
         System.out.println("Student Address is : "+address);
         System.out.println("Student Age is : "+age);
    
    }
    
}
