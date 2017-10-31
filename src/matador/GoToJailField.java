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
public class GoToJailField implements FieldInterface {
    

    private String name;
    private int number;

    public GoToJailField(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public int getNumber()
    {
        return number;
    }

    @Override
    public void consequence(Player poorplayer){
        
    }

    @Override
    public String toString()
    {
        return "GoToJailField{" + "name=" + name + ", number=" + number + '}';
    }
}
