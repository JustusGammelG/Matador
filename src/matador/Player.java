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
public class Player {
    String name;
    Field currentField;
    
    
    Player(String name){
        this.name = name;
        this.currentField = Matador.fieldArray[0];
    }
    
    
    public void move(Dice dice){
        Boolean hasNextMove = true;
        while(hasNextMove){
            
        
        int moves = dice.throwDice();
        int nextField = currentField.getNumber() + moves;
        
        
        if(nextField > 40){
            nextField = currentField.getNumber() + moves - 40;
            
            
        
            }
        this.currentField = Matador.fieldArray[nextField];
            hasNextMove = dice.dicePair();
        }
    }
}
