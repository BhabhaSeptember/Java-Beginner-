/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author User
 */
public class Utils {
//If all three methods have "throws Exception" code, they each won't deal with the error, so the error will be thrown to the stack trace

//    public static void main(String[] args) throws Exception {
    public static void main(String[] args) {
        System.out.println("in main Method...");
//        try { 
//        doThis();} catch(Exception e) {
//            System.out.println("Catching error in main method: " + e);
//            
//        }
        doThis();
        System.out.println("...back in main method --end of execution--");
    }

//    static void doThis() throws Exception {
    static void doThis() {
        System.out.println("in doThis() method...");
//        try {
//            doThat();
//        } catch (Exception e) {
//            System.out.println("Catching error in doThis(): " + e);
//        }
        doThat();
        System.out.println("...back in doThis() method");

    }

//    static void doThat() throws Exception {
    static void doThat() {
        System.out.println("in doThat() method...");
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catching error in doThat(): " + e);
        }
//        throw new Exception();
    }
}
