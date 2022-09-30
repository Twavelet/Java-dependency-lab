package org.example;

public class Robot {


    //Instance Variables (HAS A)
    public String name;
    public Weapon weapon;

    //constructor
    public Robot(Weapon weapon) {

        this.name = "Mustang";
        this.weapon = weapon;


    }

    public void Attack(){
        System.out.println(this.name + " attacks with " + this.weapon.weaponName + " for " + this.weapon.power + " damage.");

    }

}
