/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */


public class Shirt {
    
    //if you dont write this, it's done for us automatically
    public Shirt() {
        System.out.println("In Shirt Constructor");
        description = "-description required-";
        colorCode = 'U';
        price = 0.0;
    }
    
    //can initialize default values in constructor instead of here
    public String description;
    public char colorCode;
    public double price;
    
    public void display() {
        System.out.println("Shirt Description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Price: R" + price);
    }
}
