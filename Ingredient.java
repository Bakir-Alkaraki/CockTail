/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktails;

import java.io.Serializable;

/**
 *
 * @author BakiR Alkaraki & Bashar Wazwaz
 */
public abstract class Ingredient implements Serializable {
    
    private String name;
    private int calories = 0;

    public Ingredient() {
    }
    
    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;      
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public abstract int getVolume(); 
    public abstract Color getColor();

}
