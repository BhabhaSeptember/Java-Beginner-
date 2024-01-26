/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */
public class ShoppingCart {
//    //main method is starting and end point of project. 
//    //i.e. program execution starts @main method --> constructor & all associated code -->  back to main method again
//    public static void main(String[] args) {
//       Shirt myShirt = new Shirt();
////       myShirt.display(); //constructor now runs the display method so you don't need it here anymore
//        System.out.println("...the end");

    public static void main(String[] args) {
        //all necessary code is done by the constructor now
//        Shirt shirt01 = new Shirt("V-neck", "Blue", 99.99);
//        Shirt shirt02 = new Shirt("Golf Tee", "White", 159.99);
//        Shirt shirt03 = new Shirt("SweatShirt", "Black", 499.99);
//        Shirt shirt04 = new Shirt("Tank Top", "Pink", 59.99);
//        

//        shirt01.description = "V-neck";
//        shirt01.colorCode = 'B';
//        shirt01.price = 79.99;
//        shirt01.display();
//        
//        shirt02.description = "Sweatshirt";
//        shirt02.colorCode = 'G';
//        shirt02.price = 179.99;
//        shirt02.display();
//        
//        shirt03.description = "Golf Tee";
//        shirt03.colorCode = 'R';
//        shirt03.price = 109.99;
//        shirt03.display();
//        
//        shirt04.description = "Tank Top";
//        shirt04.colorCode = 'Y';
//        shirt04.price = 39.99;
//        shirt04.display();
//shirt01.setFields("V-neck", 'B', 79.99);
//shirt01.display();
//shirt02.setFields("Sweatshirt", 'G', 250.00);
//shirt02.display();
//shirt03.setFields("Gold Tee", 'R', 150.99);
//shirt03.display();
//shirt04.setFields("Tank Top", 'P', 50.00);
//shirt04.display();

// -----------------------------------------------------------------------
//        Shirt myShirt = new Shirt("V-neck", "Pink", 29.99);
//        System.out.println("Shirt color: " + myShirt.colorCode);
//        changeShirtColor(myShirt, 'G');
//        System.out.println("New shirt color: " + myShirt.colorCode);
//    }
//
//    public static void changeShirtColor(Shirt theShirt, char color) {
//        theShirt.colorCode = color;
//   



//REASSIGNING THE REFERENCE
      Shirt myShirt = new Shirt("V-neck", "Pink", 29.99);
        System.out.println("Shirt color: " + myShirt.colorCode);
        changeShirtColor(myShirt, 'G'); //will remain the same as original
        System.out.println("New shirt color: " + myShirt.colorCode);
    }

    public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt = new Shirt("Round neck", "Yellow", 199.99); //will now change the color of a new/different shirt object
        theShirt.colorCode = color;
          
    
    }
}
