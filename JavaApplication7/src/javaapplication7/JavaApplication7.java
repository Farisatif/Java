/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Zeref
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] mark;
        int l;
        System.out.println("Enter the Lunght of Array :");
        l = input.nextInt();

        mark = new int[l];
        int sum = 0;

        for (int i = 0; i < mark.length; i++) {

            System.out.println("Enter the index numer [" + (i + 1) + "] :");
            mark[i] = input.nextInt();

        }
        System.err.println(mark.length);
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
            sum += mark[i];
        }
        System.out.println(sum);
        System.out.println("%" + sum / mark.length);
    }

}
