/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktails;

/**
 *
 * @author BakiR Alkaraki & Bashar Wazwaz
 */
public class Milk extends Ingredient {

     private int volume;

    public Milk(int calories, int volume) {
        super("Milk", calories);
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }
    
    public Color getColor() {
        return new Color(255,255,255);
    }
}
