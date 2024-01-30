/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.*; //wildcard for all classes in package
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
//FORMATTING DATES
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date & time: " + today);
//
//        String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME); //ISO constant
//        System.out.println("ISO: " + sDate);
//
//        String fDate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)); 
//        System.out.println("MEDIUM: " + fDate);
//2D ARRAYS
//        int[][] yearlySales;
//        yearlySales = new int[5][4]; //5 arrays with 4 elements each 
//        yearlySales[0][1] = 1000; //year1, quarter2
//        yearlySales[2][1] = 1000; //year3, quarter2 
//        yearlySales[3][1] = 5000; //year4, quarter2
//        yearlySales[1][2] = 10_000;
//        System.out.println("Year 2, Quarter 3: R" + yearlySales[1][2]); //year2, quarter3
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




//EXAMPLE
for (int i = 1; i < 11; i++) {
    System.out.println("i = " + i);
}
    }
}
