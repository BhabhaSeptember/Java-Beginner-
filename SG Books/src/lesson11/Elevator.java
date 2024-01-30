/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

/**
 *
 * @author User
 */
public class Elevator {

    public int currentFloor = 1;

    public void changeFloor(int targetFloor) {
        System.out.println("Starting floor number: " + currentFloor);
        while (currentFloor != targetFloor) {
            if (currentFloor < targetFloor) {
                goUp();
            } else {
                goDown();
            }
        }
        System.out.println("You have reached your destination. You are now on floor: " + currentFloor);
    }
        public void goUp() {
            System.out.println("Floor number: " + currentFloor + "...moving up...");
            currentFloor++;
        }
        
        public void goDown() {
            System.out.println("Floor number: " + currentFloor + "...moving down...");
            currentFloor--;
        }
    }

