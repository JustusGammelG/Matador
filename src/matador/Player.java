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
    private String name;
    private Field currentField;
    
    
    Player(String name){
        this.name = name;
        this.currentField = Matador.fieldArray[0];
    }
    public String getName(){
          return this.name;
        }
    
    
    public void move(Dice dice){
        Boolean hasNextMove = true;
        while(hasNextMove){
        
        int moves = dice.throwDice();
        int nextField = currentField.getNumber() + moves;
        
        if(nextField > 40){
            nextField = currentField.getNumber() + moves - 40;
            }
            
        this.currentField = Matador.fieldArray[nextField -1];
        System.out.println(name + "rolled " + moves + " and landed on " + nextField );
            hasNextMove = dice.dicePair();
        }
        
    }
}
