/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */
public class Calculator {

//    public void calculate(int x, double y) {
//        System.out.println(x / y);
//    }
//    public double calculate(int x, double y) {
//        return x / y;
//    }
    
    
    
    
//USING METHOD OVERLOADING   
    public static int sum(int num1, int num2) {
        System.out.println(" Method 1: ");
        return num1 + num2;
    }

    public static float sum(float num1, float num2) {
        System.out.println(" Method 2: ");
        return num1 + num2;
    }

    public static float sum(int num1, float num2) {
        System.out.println(" Method 3: ");
        return num1 + num2;
    }
}
