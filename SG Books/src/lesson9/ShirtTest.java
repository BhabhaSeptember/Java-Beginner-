/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author User
 */
public class ShirtTest {

    public static void main(String[] args) {
        Shirt theShirt = new Shirt('G', "Flannel Shirt", 359.99);
//        theShirt.setColorCode('R');
//        System.out.println("Color code is: " + theShirt.getColorCode());
//        
//         theShirt.setColorCode('Z');
        System.out.println("The shirt's color code: " + theShirt.getColorCode());

        Shirt myShirt = new Shirt();
        System.out.println("My shirt's color code: " + myShirt.getColorCode());
    }
}
