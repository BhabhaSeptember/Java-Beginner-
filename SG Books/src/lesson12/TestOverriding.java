/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class TestOverriding {

    public static void main(String[] args) {
        Shirt2 myShirt = new Shirt2(1, "Tank top", 29.99, 'R', 'S');
        myShirt.display();
        
        System.out.println();
        
        Trousers2 myTrousers = new Trousers2(2, "Shorts", 159.99, 'B', 'S', 'F');
        myTrousers.display();

    }
}
