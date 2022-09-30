package org.example;

public class Kraken implements Attacker{

    public String name;
    public int attackPower;

    public Kraken(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " has an attack power of " + this.attackPower + ". Caution!");

    }
}
