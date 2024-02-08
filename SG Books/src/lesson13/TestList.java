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
public class TestList {

    public static void main(String[] args) {
        //Below converts an array to an array in two steps
        String[] nums = {"one", "two", "three"};
        List<String> myList = Arrays.asList(nums); //Step 1: Converting an Array to a List. Can only use methods of List interface
        System.out.println(myList);
        ArrayList<String> myArrayList = new ArrayList(myList); //Step 2: Converting to an Array List to access methods of array lists

    }

}
