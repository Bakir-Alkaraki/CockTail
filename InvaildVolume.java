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
public class InvaildVolume extends Exception {
    
    
    public InvaildVolume() {
        super("You have a Shit problem, go check it and don't play with me -_-");
    }
    
    public InvaildVolume(String msg) {
        super(msg);
    }
    
}
