/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author User
 */
public class CustomerServices {
    
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.isNew = false;
        setCustomerServices(cust);
    }
    
    public static void setCustomerServices(Customer cust) { //pass variable of type Customer
        String message = "Would you like to hear about special deals in your area?";
        if (cust.isNewCustomer()) {
            cust.sendEmail(message);
        } else {
            cust.sendEmail("Would you like to give us suggestions to improve our services?");
        }
    }
}
