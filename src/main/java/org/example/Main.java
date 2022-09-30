package org.example;

import org.example.Stick;

public class Main {
    public static void main(String[] args) {

//        Weapon stick = new Weapon("stick", 102);
//        Weapon rock = new Weapon("rock", 103);
        Stick stick = new Stick();
        Robot robot_one = new Robot("Groot", stick);
        System.out.println(robot_one.name);
        robot_one.Attack();

        Rock rock = new Rock();
        Robot robot_two = new Robot("Onyx", rock);
        robot_two.Attack();


        Bear bear = new Bear();
        Robot robot_three = new Robot("Grylls", bear);
        robot_three.Attack();
    }
}