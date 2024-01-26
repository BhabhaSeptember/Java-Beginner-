/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */
public class CalculatorTest {

    public static void main(String[] args) {

        int totalOne = Calculator.sum(2, 3);
        System.out.println("The total is: " + totalOne);

        float totalTwo = Calculator.sum(2F, 3F);
        System.out.println("The total is: " + totalTwo);

        float totalThree = Calculator.sum(2, 3F);
        System.out.println("The total is: " + totalThree);
    }
}
