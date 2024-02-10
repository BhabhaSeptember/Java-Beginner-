/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author User
 */
public class TestClass {

    public static void main(String[] args) {
        TestClass testClass = new TestClass(); //instance method so must create it first before testing
        try {
            testClass.testCheckedException(); //if you test it, there's a warning to either throw or use try-catch block
        } catch (IOException e) {
            System.out.println("Catching error: " + e);
        }
    }

    public void testCheckedException() throws IOException {
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " + testFile.exists());
    }
    
  
}
