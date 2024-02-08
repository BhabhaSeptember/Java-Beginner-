/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import java.util.*;

/**
 *
 * @author User
 */
public class TestLambda {

    public static void main(String[] args) {
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums);
        System.out.println("1. My list = " + myList);
        ArrayList<String> myArrayList = new ArrayList(myList);

        myList.replaceAll(s -> s.toUpperCase()); //List can only use List methods e.g replaceAll()
        System.out.println("2. My list = " + myList);

        myArrayList.replaceAll(x -> x.toUpperCase()); //UnaryOperator Lambda Type
        System.out.println("3. My array list = " + myArrayList);

        //Long full version
//        myList.replaceAll((String s)  //if there's only one statement you dont need the String & return keywords and the method body
//                -> {
//            return s.toUpperCase();
//        }
//        );
//
//
//
//removeIf returns a boolean , Predicate Lambda Type
        myArrayList.removeIf(s -> s.equals("TWO")); //Remove is a method for array lists
        System.out.println("4. My Array list = " + myArrayList);
    }
}
