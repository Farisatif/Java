/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polym;

/**
 *
 * @author Zeref
 */
class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 4 * side;
    }
}
