/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

/**
 *
 * @author User
 */
public class TestInterface {

    public static void main(String[] args) {
//         Shirt myShirt = new Shirt(1, "Round neck", 59.99, 'G', 'S');
//         myShirt.print();
//         System.out.println();
//         myShirt.doReturn();

        Clothing c1 = new Trousers(1, "Shorts", 59.99, 'P', 'S', 'F'); //accesses only methods of Clothing class
        Trousers t1 = new Trousers(2, "Sweatpants", 250.00, 'G', 'S', 'F'); //accesses all methods from (Clothing, Trousers & Returnable)
        Returnable r1 = new Trousers(3, "Chinos", 899.99, 'B', 'S', 'F'); //accesses only methods from Returnable interface

//        System.out.println("c1 color code = " + c1.getColorCode());
//
//        if (c1 instanceof Trousers) {
//            System.out.println("c1 fit = " + ((Trousers) c1).getFit()); //must cast to Trousers to access Trouser methods
//        }
//
//
//
//        t1.getFit(); //Can access it's own methods
//        t1.getDesc(); //Can access method from Clothing class
//        t1.doReturn(); //Can access method from Returnable interface
//
//
//        r1.doReturn(); //Can only access it's own methods
//
//
//
        if (r1 instanceof Clothing) {
//        ((Clothing) r1).getPrice(); //Casted to clothing to access Clothing methods
        }
//
//
        if (r1 instanceof Trousers) {
//        ((Trousers) r1).getColorCode(); //Casted to trousers to access methods from Trousers class
        }
    }
}
