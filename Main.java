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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Blender blender = new Blender(2000);
        Cup cup = new Cup(100);
        Sugar sugar = new Sugar(); // Const Calories with 15;
        Color color = new Color(255,0,0);
        Color color2 = new Color(255,255,75);
        Color color3 = new Color(150,255,164);
        Color color4 = new Color(255,255,255);
        Fruit fruit = new Fruit("Apple", 47, 100, color);
        Fruit fruit2 = new Fruit("Pineapple", 42, 100, color2);
        Fruit fruit3 = new Fruit("Plum", 46, 100, color3);
        Fruit fruit4 = new Fruit("Strawberry", 80, 40, color);
        Milk milk = new Milk("Milk", 42, 100, color4);
        blender.add(fruit);
        blender.add(fruit2);
        blender.add(fruit3);
        blender.add(fruit4);
        blender.add(milk);
        blender.add(sugar);
        blender.blend();
        blender.pour(cup, 20);
        blender.pour(cup, 60);
        blender.pour(cup, 4);
        System.out.println("Cup Volume " +  cup.getVolume());
        System.out.println("Cup Calories " +  cup.getCalories());
        System.out.println("Blender Capacity " +  blender.getCapacity());
        System.out.println("Blender Volume " +  blender.getVolume());
        System.out.println("Blender Calories " +  blender.getCalories());
    }
    
}
