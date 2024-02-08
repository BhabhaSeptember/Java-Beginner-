/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class TestPolymorphism {

    public static void main(String[] args) {
        Clothing2 c1 = new Shirt2(1, "Round neck", 59.99, 'G', 'S');
        Clothing2 c2 = new Trousers2(2, "Chinos", 599.99, 'O', 'S', 'F');
        Clothing2 c3 = new Socks2(3, "Basketball socks", 20.00, 'W');

        c1.display();
        System.out.println();
        c2.display();
        System.out.println();
        c3.display();
        System.out.println();

// c1.getFit; //type clothing cannot access the methods of the subclass shirt but you can cast it to a shirt
        if (c1 instanceof Shirt2) {
//            ((Shirt2) c1).getFit(); //this will work
            System.out.println("Shirt fit = " + ((Shirt2)c1).getFit());
        }

        if (c2 instanceof Trousers2) {
//            ((Trousers2) c2).getFit(); //this will work
            System.out.println("Trousers fit = " + ((Trousers2) c2).getFit());
        }

// ((Shirt2)c2).getFit();//runtime error (tousers cannot be cast to a shirt) therefore do checks using 'instanceof' before casting 
    }

}
