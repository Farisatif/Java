/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Name : ");
        String nam = input.nextLine().toLowerCase();

        int n = nam.length();

        for (int i = 0; i < n; i++) {

            String a = nam.charAt(i) == 'o'
                    || nam.charAt(i) == 'i'
                    || nam.charAt(i) == 'u'
                    || nam.charAt(i) == 'e'
                    || nam.charAt(i) == 'a' ? "Vowel" : "No Vowel";

            System.err.println(nam.charAt(i) + " is " + a);

        }

    }

}
