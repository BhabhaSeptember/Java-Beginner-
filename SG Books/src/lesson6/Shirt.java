/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author User
 */
public class Shirt {
    public int shirtID;
    public double price;
    public char colorCode;
    
    public static void main(String[] args) {
        int counter  = 10;
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();
        
        myShirt.shirtID = 12;
        myShirt.price = 79.99;
        myShirt.colorCode = 'G'; //Note 'char' values are placed in single quotes
        
        yourShirt.shirtID = 12;
        yourShirt.price = 109.99;
        yourShirt.colorCode = 'B'; //Note 'char' values are placed in single quotes
        
        //Changing myShirt address to yourShirt object address
         myShirt = yourShirt; 
         
        //Changing colorCode of shirts
        myShirt.colorCode = 'R';
        yourShirt.colorCode = 'G';
        
        System.out.println("myShirt: " + myShirt.colorCode + " |vs| yourShirt: " + yourShirt.colorCode ); //outputs same as yourShirt because of address change
       
    }
}
