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
public class Field {
    private String name;
    private int number;
    
    Field(String name, int number){
        this.name = name;
        this.number = number;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + " number: " + number;
    }
}
