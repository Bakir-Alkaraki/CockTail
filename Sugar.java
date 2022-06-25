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
public class Sugar extends Ingredient {

    private int volume;

    private Color color;
    
    public Sugar(){
        super("Sugar", 200);
        this.volume = 0;
        this.color = new Color(255,255,255);
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    public Color getColor(){
        return new Color(255,255,255);
    }
    
}
