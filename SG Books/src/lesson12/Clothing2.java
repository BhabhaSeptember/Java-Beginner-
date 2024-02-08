/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public abstract class Clothing2 {
    private int itemID;
    private String desc;
    private double price;
    private char colorCode;

    
    
    public Clothing2 (int itemID, String desc, double price, char colorCode) {
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.colorCode = colorCode;
    }
    
    
    
    
    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the price
     */
    public abstract double getPrice(); //classes that extend this abstract method are forced to implement that method themselves

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
    
    public abstract void display() ;
//    {
//        System.out.println("Item ID = " + getItemID() + "\n" +
//                "Description = " + getDesc() + "\n" +
//                "Price = R" + getPrice() + "\n" +
//                "Color code = " + getColorCode());
//    }
    
}
