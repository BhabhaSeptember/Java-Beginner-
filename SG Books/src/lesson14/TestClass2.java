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
public class TestClass2 {

    public static void main(String[] args) {
        //Can catch multiple types of errors but always put superclass 'Exception' error last
        try {
            createFile("c:/testFile.txt");
        } catch (IOException e) {
            System.out.println("File error: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void createFile(String name) throws IOException {
        File f = new File(name);
        f.createNewFile();

        int[] intArray = new int[5];
        intArray[5] = 27;
    }
}
