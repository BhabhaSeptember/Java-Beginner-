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
 //FIELDS OR PROPERTIES
    public String description;
    public char colorCode;
    public double price;

    
//can initialize default values in constructor    
//if you dont write this, it's done for us automatically
//CONSTRUCTOR EXAMPLE 1
//    public Shirt() {
//        System.out.println("In Shirt Constructor");
//        description = "-description required-";
//        colorCode = 'U';
//        price = 0.0;

    
//CALLING A METHOD IN THE SAME CLASS
//    display();
//    this.display(); 
//    }

    
//CONSTRUCTOR EXAMPLE 2
    public Shirt(String desc, String color, double price) {
       setFields(desc, price);
       setColor(color);
//       display();
    }

    
    
//METHODS OR BEHAVIOURS
    public void setColor(String color) {
        if (color.length() > 0 ) {
            colorCode = color.charAt(0);
        }
    }
    
    
    public void display() {
        System.out.println("Shirt Description: " + description);
        System.out.println("Color code: " + colorCode);
        System.out.println("Price: R" + price);
           
    }
    
    
    public void setFields(String desc, double price) {
        this.description = desc;
         this.price = price;
    }
}
