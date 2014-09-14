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
public class Warrior {
    private int strentch=10;
    private int dexteruty=10;
    private int health=10;
    private int worth=10;
    void getWeapon(Weapon weapon){
        if (weapon instanceof Bow){
            setWorth(getWorth() + 2);
            setDexteruty(getDexteruty() + 2);
        }
        else{
            setWorth(getWorth() + 2);
            setStrentch(getStrentch() + 2);
        }
    }
    void lostWeapon (Weapon weapon){
        if (weapon instanceof Bow){
            setWorth(getWorth() - 2);
            setDexteruty(getDexteruty() + 2);
        }
        else{
            setWorth(getWorth() - 2);
            setStrentch(getStrentch() - 2);
        }
    }

    /**
     * @return the strentch
     */
    public int getStrentch() {
        return strentch;
    }

    /**
     * @param strentch the strentch to set
     */
    public void setStrentch(int strentch) {
        this.strentch = strentch;
    }

    /**
     * @return the dexteruty
     */
    public int getDexteruty() {
        return dexteruty;
    }

    /**
     * @param dexteruty the dexteruty to set
     */
    public void setDexteruty(int dexteruty) {
        this.dexteruty = dexteruty;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
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
