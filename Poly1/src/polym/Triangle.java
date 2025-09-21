/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polym;

/**
 *
 * @author Zeref
 */
class Triangle extends Shape {
    double sideA, sideB, sideC;

    Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    double perimeter() {
        return sideA + sideB + sideC;
    }
}

