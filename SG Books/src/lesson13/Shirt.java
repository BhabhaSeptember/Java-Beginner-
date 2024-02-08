/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author User
 */
public class Shirt extends Clothing implements Printable, Returnable {

    private char fit = 'U';

    public Shirt(int itemID, String desc, double price, char colorCode, char fit) {
        super(itemID, desc, price, colorCode);
        this.fit = fit;
    }

    /**
     * @return the fit
     */
    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }

    //forced by abstract method in superclass to do its own
    @Override
    public double getPrice() {
        return 29.99;
    }

    //We no longer need the display method below because we have overridden the toString method to show details of item instead of printing the default hashcode/object address
//    @Override
//    public void display() {
////        super.display();
//        System.out.println("Fit = " + getFit());
//    }
    @Override
    public String toString() {
        System.out.println("Testing toString");
        return "\nItem ID = " + getItemID()
                + "\nDescription = " + getDesc()
                + "\nPrice = R" + getPrice()
                + "\nColor code = " + getColorCode()
                + "\nFit = " + getFit();
    }

    //method below forced by implemented interface
    @Override
    public void print() {

        System.out.println("Testing Interface: Printable \nItem ID = " + getItemID()
                + "\nDescription = " + getDesc()
                + "\nPrice = R" + getPrice()
                + "\nColor code = " + getColorCode()
                + "\nFit = " + getFit());

    }

    @Override
    public void doReturn() {
        System.out.println("Returning: Shirt");

    }

}
