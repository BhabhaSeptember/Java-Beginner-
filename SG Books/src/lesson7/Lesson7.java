/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7;

/**
 *
 * @author User
 */
public class Lesson7 {

    public static void main(String[] args) {
        
//CONCATENATING STRINGS     
//        String myString = "Hello";
//        System.out.println("Original: " + myString);
//        myString = myString.concat(" World");
//        System.out.println("Updated: " + myString);
//        myString = myString + "!";
//        System.out.println("Update2: " + myString);




//STRING METHOD CALLS WITH PRIMITIVE RETURN VALUES
//        int stringLength = myString.length();
//        System.out.println("String Length = " + stringLength);





//STRING METHOD CALLS WITH OBJECT RETURN VALUES
//        String greet = " HOW ".trim(); //removes spaces
//        System.out.println("'" + greet + "'");
//        String lc = (greet + "DY").toLowerCase();
//        System.out.println(lc);
//        System.out.println(lc.indexOf("how"));



//USING JAVA API DOCUMENTATION
//NOTE: 1-arg | indexOf(' idx of first occurrence of specified char')
//        String phoneNum = "404-543-2345";
//        int index1 = phoneNum.indexOf('-');
//        System.out.println("Index of first dash: " + index1);
//NOTE: 2-arg | indexOf('char' , idx to begin search')        
//        int index2 = phoneNum.indexOf('-', index1+1);
//        System.out.println("Second dash index: " + index2);
    



//STRING BUILDER
// StringBuilder mySB = new StringBuilder("Hello");
// mySB.append(" string builders");
//        System.out.println(mySB);
   


//PRIMITIVE DATA TYPES
//long num = -2048578397598378L;
//float pi = 3.141592F;



//PRE-INCREMENT & POST-INCREMENT
//int id = 6;
//int newID = ++id;
//        System.out.println(newID);
//
//int id2 = 6;
//int newID2 = id2++;
//        System.out.println(newID2);
//        System.out.println(id2);
        
 
//int count = 15;
//int a, b, c, d;
//a = count++; //outputs 15, count = 16
//b = count;  //outputs 16, count = 16
//c = ++count; //outputs 17, count = 17
//d = count; //outputs 17       
//System.out.println("a: " + a + " | b: " + b + " | c: " + c + " | d: " + d);





//CAUTION WITH PROMOTION
//int num1 = 55_555;
//int num2 = 66_666;
//long num3;
//num3 = num1 * num2; //will make temp storage for int - resulting in loss or distortion of data
//System.out.println(num3);   


//int num4 = 55_555;
//long num5 = 66_666;
//long num6;
//num6 = num4 * num5; //will choose temp storage for largest type
//System.out.println(num6);   


//int num1 = 7;
//int num2 = 2;
//double num3;
//num3 = num1 / num2;
//System.out.println(num3); //decimal place is lost 
 

// int num4 = 7;
// double num5 = 2; 
// double num6; 
// num6 = num4 / num5; //temp memory of type double would have been created
// System.out.println(num6);



//TYPE CASTING
//int num1 = 20L; //returns error
//int num1 = (int)20L; //converts long to an int

//short num2 = (short)3.0; 

//int myInt;
//myInt = (int)1_238_574_439_896L;
//System.out.println(myInt);


//byte num1 = 1;
//byte num2 = 2; //smallest temp memory is int
//byte num3 = (byte)(num1 + num2);

    }
}
