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
public abstract class OwnableField implements FieldInterface{
    private String name;
    private int number;
    private int price;
    private Player owner = null;

    protected OwnableField(String name, int number, int price)
    {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getNumber(){
        return number;
    }

    public int getPrice(){
        return price;
    }

    public Player getOwner(){
        return owner;
    }

    public void setOwner(Player owner){
        this.owner = owner;
    }

    @Override
    public String toString(){
        return "OwnableField{" + "name=" + name + ", number=" + number 
                + ", price=" + price + ", owner=" + owner + '}';
    }
    
    
    

}
