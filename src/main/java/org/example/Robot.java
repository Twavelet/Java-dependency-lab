package org.example;

public class Robot implements Attacker{


    //Instance Variables (HAS A)
    public String name;
    public Weapon weapon;

    //constructor
    public Robot(String name, Weapon weapon) {

        this.name = name;
        this.weapon = weapon;


    }

    public void Attack(){
        System.out.println(this.name + " attacks with a " + this.weapon.weaponName + " for " + this.weapon.power + " damage.");

    }

}
