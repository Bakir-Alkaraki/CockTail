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
public class Cup {
    private int capacity;
    private int volume;
    private int calories;

    public Cup(int capacity) {
        this.capacity = capacity;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume += volume;
        System.out.println("Success Added Volume To Cup");
    }

    public void setCalories(int calories) {
        this.calories += calories;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public int getCalories() {
        return this.calories;
    }
    
    public String getCupInfo()
    {
        return "Cup Information\nCup Capacity: " + getCapacity() + "\nCup Volume: " + getVolume() + "\nCup Calories: " + getCalories();
    }
    
    
}
