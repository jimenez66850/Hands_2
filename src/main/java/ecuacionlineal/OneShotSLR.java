/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacionlineal;

import jade.core.behaviours.OneShotBehaviour;


/**
 *
 * @author luis
 */
public class OneShotSLR extends OneShotBehaviour{
    private float numeroAPredecir;
    public OneShotSLR(float _numeroAPredecir){
        numeroAPredecir = _numeroAPredecir;
    }
    @Override
    public void action() {
        SLRECUATION prediccion = new SLRECUATION(numeroAPredecir);
        System.out.println(prediccion.toString());      
} 
    
}
    
    

