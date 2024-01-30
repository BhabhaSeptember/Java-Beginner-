/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author User
 */
public class Lesson10 {

    public static void main(String[] args) {
//        int i = 2;
//        int j = 12;
//        System.out.println((i < 1) && (j > 6));
//        System.out.println((i < 1) || (j > 6));
//        System.out.println(!(i < 5));

//TERNARY OPERATOR
//        int x = 2, y = 5, z;
//        z = (y > x) ? x : y;
//        System.out.println("Z: " + z);
//        int numberOfGoals = 1;
//        System.out.println("I scored " + numberOfGoals + " " + (numberOfGoals == 1 ? "goal" : "goals"));
//        int month = 2;
//        boolean isLeapYear = true;
//
//        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
//            System.out.println("There are 31 days in the month.");
//        } else if (month == 2) {
//            if (!isLeapYear) {
//                System.out.println("There are 28 days in the month.");
//            } else {
//                System.out.println("There are 29 days in the month.");
//            }
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            System.out.println("There are 30 days in the month.");
//        } else {
//            System.out.println("Invalid month.");
//        }


        int month = 4;
        boolean isLeapYear = true;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in the month.");
                break;
            case 2:
                if (!isLeapYear) {
                    System.out.println("There are 28 days in the month.");
                } else {
                    System.out.println("There are 29 days in the month.");
                    break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in the month.");
                break;
            default:
                System.out.println(month + " is an invalid month!");
        }

    }
}
