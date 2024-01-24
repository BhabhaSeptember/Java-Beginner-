/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author User
 */
public class Customer {
    public String name = "Jane Doe"; //Default name 
    public int custID;
    public String address;
    public int orderNum;
    public int age = 30;
    
    //void means method doesn't output any information
    public void displayCustomer() {
        System.out.println("Customer: " + name);
    }
}
