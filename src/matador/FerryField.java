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
public class FerryField extends OwnableField {

    public FerryField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    public void consequence(Player poorPlayer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOwner(Player owner) {
        super.setOwner(owner); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getOwner() {
        return super.getOwner(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumber() {
        return super.getNumber(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
