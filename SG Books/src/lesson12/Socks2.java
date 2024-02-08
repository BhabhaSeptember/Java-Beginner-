/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class Socks2 extends Clothing2 {

    public Socks2(int itemID, String desc, double price, char colorCode) {
        super(itemID, desc, price, colorCode);
    }

    @Override //forced by asbtract superclass to implement fields
    public double getPrice() {
        return 7.99;
    }

    @Override
    public void display() {

    }
}
