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
public class Fruit extends Ingredient {
    private int volume;
    private Color color;

    public Fruit(String name, int calories, int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }


    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
