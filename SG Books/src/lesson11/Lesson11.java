/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

//import java.time.*; //wildcard for all classes in package

import java.util.ArrayList;

//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;
//import java.time.chrono.JapaneseDate;
//import java.time.LocalDate;
//
/**
 *
 * @author User
 */
public class Lesson11 {

    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println("Local date: " + date);
//        JapaneseDate jDate = JapaneseDate.from(date);
//        System.out.println("Japanese date: " + jDate);

//LocalDate date2 = date.minusWeeks (10);
//        System.out.println("Local date minus 10 weeks is: " + date2);
//
//LocalDate date3 = date.plusDays (10);
//        System.out.println("Local date plus 10 days is: " + date3); 
//
//
//
//FORMATTING DATES
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date & time: " + today);
//
//        String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME); //ISO constant
//        System.out.println("ISO: " + sDate);
//
//        String fDate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)); 
//        System.out.println("MEDIUM: " + fDate);
//
//
//
//2D ARRAYS
//        int[][] yearlySales;
//        yearlySales = new int[5][4]; //5 arrays with 4 elements each 
//        yearlySales[0][1] = 1000; //year1, quarter2
//        yearlySales[2][1] = 1000; //year3, quarter2 
//        yearlySales[3][1] = 5000; //year4, quarter2
//        yearlySales[1][2] = 10_000;
//        System.out.println("Year 2, Quarter 3: R" + yearlySales[1][2]); //year2, quarter3
//
//
//
//
//WHILE LOOP WITH COUNTER
//System.out.println("/*");
//int counter = 0;
////in counter = 5;
////while (counter > 0 ) {
//while (counter < 5) {
//    System.out.println(" *");
////    counter--;
//    counter++;
//}
//        System.out.println("*/");
//
//
////FOR LOOP (using above example)
//        System.out.println("/*");
////        for (int counter = 3; counter > 0; counter--) {
////            System.out.println("*");
////        }
//
//        for (int counter = 0; counter < 3; counter++) {
//            System.out.println("*");
//        }
//        System.out.println("*/");
//
//
//
//EXAMPLE
//for (int i = 1; i < 11; i++) {
//    System.out.println("i = " + i);
//}
//
//
//
//
//COMPARING FOR LOOP & WHILE LOOP
//int i = 0;
//while (i < 3) {
//    System.out.println(" *");
//    i++;
//            
//}
//for (int num = 0; num < 3; num++) {
//    System.out.println(" *");
//    }
//
//
//
//
//ENHANCED 'FOR' LOOP
//        String[] names = {"John", "Bill", "Meredith", "Derek"};
//        for (String name : names) {
//            System.out.println("- " +  name);
//        }
//
//
//
//STANDARD FOR LOOP
//for (int idx = 0; idx < names.length; idx++) {
//    System.out.println("* " + names[idx]);
//}
//    }
//
//
//
//
//
        //DO/WHILE LOOP
        //OPPOSITE OF WHILE LOOP (DO WHILE WILL EXECUTE ATLEAST ONCE)
        //EXAMPLE
//        int i = 0;
//        do {
//            System.out.println("i");
//            i++;
//        } while (i < 10);
//
//
//
//
// factorial (5); //calls factorial method below
//  String[] names = {"John", "Bill", "Meredith", "Jane Doe", "Derek"};
//        for (String name : names) {
//            if (name.equals("Jane Doe")) {
////                continue; //will continue looping through array vs BREAK which will EXIT the loop immediately 
//            System.out.println("+ " + name); 
//            }
//            System.out.println("- " + name);
//        }
//
//
//
//NESTED FOR LOOP
//A TABLE WITH 4 ROWS AND 10 COLUMNS
//int height = 4, width = 10;
//
//for (int row = 0; row < height; row++) { 
//    for (int col = 0; col < width; col++) {
//        System.out.print("@");
//    }
//    System.out.println();
//}
//
//
//
//
//NESTED WHILE LOOP
//String name = "Bhabha";
//String guess = "";
//int attempts = 0;
//while(!guess.equalsIgnoreCase(name)) {
//    guess = "";
//    while (guess.length() < name.length()) {
//        char asciiChar = (char) (Math.random() * 26 + 97); //Number of asciiChar letters avail
//        guess += asciiChar;
//    }
//    attempts++;
//}
//        System.out.println("The name: " + name + " has been found after " + attempts + " guesses!!");
//
//
//
//
//PROCESSING A 2-D ARRAY
//        int sales[][] = new int[3][4];
//        sales = initArray(sales);
//        for (int y = 0; y < 3; y++) {
//            System.out.println("Year" + (y+1));
//            for (int q = 0; q < 4; q++) {
//                System.out.print("\t Quarter" + (q+1) + " = R" + sales[y][q]);
//            }
//            System.out.println(); //prints new line
//        }
//
//
//
//
//
//ARRAYLIST CLASS
ArrayList<String> names; //declaring
names = new ArrayList(); //initialialized with object

names.add("Jerry");
names.add("Pauline");
names.add("Julia");
names.add("Barry");
names.add("Bill");
        System.out.println("1. " + names);

names.remove(0); //removes element in index zero
System.out.println("2." + names);
names.remove(names.size() - 1); //removes last element
System.out.println("3. " + names);
names.remove("Barry");
        System.out.println("4. " + names);
        

    } //END OF MAIN METHOD

//        static void factorial(int target) {
//        int save = target;
//        int fact = 1;
//        do {
//            fact *= target--;
//        } while (target > 0);
//        System.out.println("Factorial for " + save +  " = " + fact );
//
//
//
//
//PROCESSING 2-D ARRAY METHOD  
//    static int[][] initArray(int[][] sales) {
//        for (int y = 0; y < 3; y++) {
//            for (int q = 0; q < 4; q++) {
//                sales[y][q] = (int) Math.floor(Math.random() * 20_000);
//            }
//        }
//        return sales;
//    }
} //END OF LESSON 11 CLASS
