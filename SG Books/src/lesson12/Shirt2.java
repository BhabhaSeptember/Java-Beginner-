/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class Shirt2 extends Clothing2 {
    
    private char fit = 'U';
    
    
    public Shirt2 (int itemID, String desc, double price, char colorCode, char fit) {
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
    
    @Override
    public void display() {
//        super.display();
        System.out.println("Fit = " + getFit());
    }
}
