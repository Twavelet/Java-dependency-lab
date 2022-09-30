package org.example;

public class Robot {


    //Instance Variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;

    public Robot() {

        this.name = "Mustang";
        this.weaponName = "Sally";
        this.weaponPower = 101;


    }

    public void Attack(){
        System.out.println(this.name + " attacks with " + this.weaponName + " for " + this.weaponPower + " damage.");

    }

}
