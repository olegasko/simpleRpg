/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplerpg;

/**
 *
 * @author oleg
 */
public class Weapon {
    private int damage=10;
    private int protection=10;
    private int worth=5;
    void upgradeWeapon(Weapon weapon){
        setDamage(getDamage() + 5);
        setWorth(getWorth() + 1);
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the protection
     */
    public int getProtection() {
        return protection;
    }

    /**
     * @param protection the protection to set
     */
    public void setProtection(int protection) {
        this.protection = protection;
    }

    /**
     * @return the worth
     */
    public int getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(int worth) {
        this.worth = worth;
    }
}
