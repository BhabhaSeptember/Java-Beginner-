/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class TestInheritance {

    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        myShirt.setSize('S');
//        myShirt.display();
//        myShirt.setNeckSize(26);
//        myShirt.display();
//        
//        
//        Trousers myPants = new Trousers();
//        myPants.setSize('S');
//        myPants.setGender('F');
//        myPants.display();
//        
//        
//        Socks mySocks = new Socks();
//        mySocks.setSize('S');
//        mySocks.display();

 
//Shirt myShirt = new Shirt(1, "Round neck", 'B', 49.99, 'S');
//myShirt.display();
//System.out.println("Fit = " + myShirt.getFit());
// 
//
//
//
Shirt myShirt = new Shirt(59.99, 'S');
System.out.println("1. Fit = " + myShirt.getFit() );
        myShirt.display();
        
        
Shirt shirt2 = new Shirt('M');
System.out.println("\n2. Fit = " + shirt2.getFit());
shirt2.display();
        
    }
}
