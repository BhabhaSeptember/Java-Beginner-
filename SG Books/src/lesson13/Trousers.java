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
public class Trousers extends Clothing implements Returnable {

    private char gender;
    private char fit;

    public Trousers(int itemID, String description, double price, char colorCode, char fit, char gender) {
        super(itemID, description, price, colorCode);
        this.fit = fit;
        this.gender = gender;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
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

    
    @Override
    public double getPrice() {
        return 109.99;
    }
    
    @Override
    public void display() {
//        super.display();
        System.out.println("Fit = " + fit);
        System.out.println("Gender = " + gender);

    }

    @Override
    public void doReturn() {
        System.out.println("Returning: Trousers");
    }
}
