/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author User
 */
public class Employees {

    public String name1 = "John Smith";
    public String name2 = "john Smith";

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same name");
        } else {
            System.out.println("Different name");
        }

    }

    public static void main(String[] args) {
        Employees emps = new Employees();
        emps.areNamesEqual();
    }
}
