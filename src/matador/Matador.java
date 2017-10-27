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
import java.util.Arrays;

public class Matador {
    public static Field[] fieldArray = new Field[40];
    
    private Dice dice = new Dice();
    
    public void fillBoard(){
        for(int i = 0; i <= 39; i++){
            fieldArray[i] = new Field("Field" + (i + i), i + 1);
            }
            System.out.print( "Board" + Arrays.toString(fieldArray));
        }
    
    public void play(){
        Player p1 = new Player("John");
        Player p2 = new Player("Hans");
        
        for(int i = 0; i < 20; i++){
            p1.move(dice);
            p2.move(dice);
        }
    }
    
    public static void main(String[] args) {
        
        Matador driver = new Matador();
        
        driver.fillBoard();
        
        driver.play();
        
        
        
        
        
            
        }
    }   

