//In the ShoppingCart class:
//3.  Declare and instantiate a Shirt object using an Item reference type.
//      Call the 3-arg constructor to assign values.
//4.  Call the display method of the object.
//5.  Use instanceof to confirm that the object is, indeed, a Shirt.
//6.  If it is a Shirt, 
//      - cast the object to a Shirt and call the getColor method, assigning 
//        the return value to a String variable.
//      - Print out the color name using a suitable label.
//7.  If it is not a Shirt, print a message to that effect.
//8.  Test your code.  You can test the non-Shirt object condition
//      by instantiating an Item object instead of a Shirt object.
package ex12_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        Item myShirt = new Shirt(59.99, 'S', 'P'); //valid item test
        //Item myShirt = new Trousers(); //invalid item test

        // call the display method on the object, then the getColor method
        myShirt.display();

        if (myShirt instanceof Shirt) {
            String shirtColor = ((Shirt) myShirt).getColor();
            System.out.println("Shirt color = " + shirtColor);

        } else {
            System.out.println("Sorry, this item is not an instance of a Shirt");
        }
    }
}
