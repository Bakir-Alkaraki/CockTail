/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktails;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author BakiR Alkaraki & Bashar Wazwaz
 */
public class Blender implements Serializable {
    
    private ArrayList<Ingredient> ingredients;

    private int capacity;
    private int volume;
    private int calories;
    private int redAvg = 0;
    private int blueAvg = 0;
    private int greenAvg = 0;
    private Color color;
    private boolean firstBlend = false;
    private int colorMixFixed = 0;
    
    public Blender() {
    }
    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
    }

    public void add(Ingredient ingredient) throws BlenderOverFlowException {
        if (this.volume + ingredient.getVolume() > this.capacity)
        {           
            throw new BlenderOverFlowException();
        }
        else
        {             
            this.ingredients.add(ingredient);
            this.volume += ingredient.getVolume();
            System.out.println("Success Added New Ingredient!");  
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void blend() throws BlenderOverFlowException {
        if (this.ingredients.isEmpty())
        {
            throw new BlenderOverFlowException();
        }      
        for (Ingredient i : this.ingredients)
        {
            this.redAvg += i.getColor().getR();
            this.greenAvg += i.getColor().getG();
            this.blueAvg += i.getColor().getB();
            this.calories += i.getCalories();
        }
        
        colorMixFixed = (ingredients.size() + 1);
        if (firstBlend)
        {
            this.redAvg = this.redAvg/colorMixFixed;
            this.greenAvg = this.greenAvg/colorMixFixed;
            this.blueAvg = this.blueAvg/colorMixFixed;
            this.color = new Color(this.redAvg, this.greenAvg,this.blueAvg);
            System.out.println("The CockTail final Color Mixture is: " + "(" + getFinalColor() + ")");         
        }
        else
        {
            this.redAvg = this.redAvg/ingredients.size();
            this.greenAvg = this.greenAvg/ingredients.size();
            this.blueAvg = this.blueAvg/ingredients.size();
            this.color = new Color(this.redAvg, this.greenAvg,this.blueAvg);
            System.out.println("The CockTail final Color Mixture is: " + "(" + getFinalColor() + ")");           
        }
        firstBlend = true;
        this.ingredients.clear();
    }

    public int getRedAvg() {
        return redAvg;
    }

    public int getBlueAvg() {
        return blueAvg;
    }

    public int getGreenAvg() {
        return greenAvg;
    }
    
    public String getFinalColor()
    {
        return "" + getRedAvg() + "," + getGreenAvg() + "," + getBlueAvg();
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    
    public int getVolume() {
        return this.volume;
    }

    public void pour(Cup cup, int volume) throws CupOverFlowException,BlenderIsEmptyException {
        if (this.volume > 0){
            int toCup = this.calories * volume; // عمل نسبة وتناسب
            int send = toCup / this.volume; // قسمة النسبة والتناسبة على الحجم الكلي
            cup.setCalories(send);
            this.calories -= send;
            cup.setVolume(volume);
            this.volume -= volume;                          
        }
        else{
            throw new BlenderIsEmptyException();
        }
       
    }
    
}
