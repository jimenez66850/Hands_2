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
    @Override
    public void action() {
        SLRECUATION ecuacion = new SLRECUATION();
        ecuacion.setLinearEcuation();
        System.out.println(ecuacion.to_String());
    }
    
}
