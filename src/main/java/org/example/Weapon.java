package org.example;

public abstract class Weapon {

    //Instance Variables - "has a"
        public String weaponName;
        public  int power;


        //Constructors
        public Weapon(String weaponName, int power) {
            this.weaponName = weaponName;
            this.power = power;
        }
    }

