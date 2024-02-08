/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author User
 */
public class TestToString {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt(1, "Round neck", 59.99, 'G', 'S');
        System.out.println(myShirt); //printing object prints address of where the address is on the heap using the toString method of the Object class
//        myShirt.display();
    }
}
