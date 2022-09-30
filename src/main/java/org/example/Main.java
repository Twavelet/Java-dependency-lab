package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon stick = new Weapon("stick", 102);
//        Weapon rock = new Weapon("rock", 103);
        Robot robot_one = new Robot(stick);
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}