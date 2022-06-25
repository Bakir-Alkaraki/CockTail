/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktails;

/**
 *
 * @author BakiR Alkaraki
 */
public class BlenderOverFlowException extends Exception{
    
    public BlenderOverFlowException(){
        super("Ingredients volume exceeds blender capacity");
    }
    public BlenderOverFlowException(String msg){
        super(msg);
    }
    
}
