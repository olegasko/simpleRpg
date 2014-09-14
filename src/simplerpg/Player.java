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
public class Player {
    private int amauntOfMany=100;
    private int strentchOfArmy=0;
    private int numbersOfArcher=0;
    private int numberOfSwordsman=0;
    private String nameOfPlayer="Noname";
    public void buyWarrior(Warrior warrior){
        setAmauntOfMany(getAmauntOfMany() - warrior.getWorth());
        setStrentchOfArmy(getStrentchOfArmy() + warrior.getStrentch());
        if (warrior instanceof Archer){
            numbersOfArcher++;
        }
        else{
            numberOfSwordsman++;
        }
    }
    public void lostWarrior(Warrior warrior){
        setStrentchOfArmy(getStrentchOfArmy() - warrior.getStrentch());
    }

    /**
     * @return the amauntOfMany
     */
    public int getAmauntOfMany() {
        return amauntOfMany;
    }

    /**
     * @param amauntOfMany the amauntOfMany to set
     */
    public void setAmauntOfMany(int amauntOfMany) {
        this.amauntOfMany = amauntOfMany;
    }

    /**
     * @return the strentchOfArmy
     */
    public int getStrentchOfArmy() {
        return strentchOfArmy;
    }

    /**
     * @param strentchOfArmy the strentchOfArmy to set
     */
    public void setStrentchOfArmy(int strentchOfArmy) {
        this.strentchOfArmy = strentchOfArmy;
    }

    /**
     * @return the numbersOfArcher
     */
    public int getNumbersOfArcher() {
        return numbersOfArcher;
    }

    /**
     * @param numbersOfArcher the numbersOfArcher to set
     */
    public void setNumbersOfArcher(int numbersOfArcher) {
        this.numbersOfArcher = numbersOfArcher;
    }

    /**
     * @return the numberOfSwordsman
     */
    public int getNumberOfSwordsman() {
        return numberOfSwordsman;
    }

    /**
     * @param numberOfSwordsman the numberOfSwordsman to set
     */
    public void setNumberOfSwordsman(int numberOfSwordsman) {
        this.numberOfSwordsman = numberOfSwordsman;
    }

    /**
     * @return the nameOfPlayer
     */
    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    /**
     * @param nameOfPlayer the nameOfPlayer to set
     */
    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }
}
