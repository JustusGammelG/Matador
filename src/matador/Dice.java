/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author Bruger
 */
public class Dice {
    private int eyes1;
    private int eyes2;
    Dice(){
        
    }
    
    public int throwDice(){
        this.eyes1 = ((int)(Math.random()*6)+1);
        this.eyes2= ((int)(Math.random()*6) +1);
        
        return this.eyes1 + this.eyes2;
    }
    
    public Boolean dicePair(){
    return this.eyes1 == this.eyes2;
    }
    
    
}
