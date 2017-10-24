/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matador;

/**
 *
 * @author Justus
 */
public class Matador {
    public static Field[] fieldArray = new Field[40];
    
    public static void main(String[] args) {
        Dice dice = new Dice();
        
        for(int i = 0; i <= 40; i++){
            fieldArray[i] = new Field("Field" + i, i);
        
        Player John = new Player("John");
        Player Jens = new Player("Jens");
        
            System.out.println(John + " is player one");
            System.out.println(Jens + " is player two");
        
            
            System.out.println("Player one's turn. Roll you dice ");
            John.move(dice);
        }
    }
    
    
    
}
