/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacionlineal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class SLRECUATION {
    private ArrayList<Float> xValues;
    private ArrayList<Float> yValues;
    private float mediaX,mediaY,pendiente,interseccion,prediccion,numeroAPredecir;
    public SLRECUATION(float numeroX){
        xValues = new ArrayList<>();
        yValues = new ArrayList<>();
        addXValues();
        addYValues();
        setLinearEcuation();
        setPrediction(numeroX);
        numeroAPredecir = numeroX;
    }
    public void setLinearEcuation(){
        mediaX = calcularMedia(xValues);
        mediaY = calcularMedia(yValues);
        pendiente = calcularPendiente();
        interseccion = calcularInterseccion();
    }
    
    @Override
    public String toString(){
        if (pendiente<0)
            return "\nMedia de X: " + String.valueOf(mediaX) +"\nMedia de Y: " + String.valueOf(mediaY)+ "\nEcuacion: Y = " + String.valueOf(interseccion)+ " "+ String.valueOf(pendiente)+"x\nResultados: [X-->Y] ["+String.valueOf(numeroAPredecir)+" -->"+String.valueOf(prediccion)+"]\n";
        else
            return "\nMedia de X: " + String.valueOf(mediaX) +"\nMedia de Y: " + String.valueOf(mediaY)+ "\nEcuacion: Y = " + String.valueOf(interseccion)+ " + "+ String.valueOf(pendiente)+"x\nResultados: [X-->Y] ["+String.valueOf(numeroAPredecir)+" -->"+String.valueOf(prediccion)+"]\n";
    }
    public float getPrediction(){       
        return prediccion;
    }
    public void setPrediction(float numeroX){
        prediccion = interseccion + (pendiente * numeroX);
    }
    
    private void addXValues(){
        xValues.add((float)23.0);
        xValues.add((float)26.0);
        xValues.add((float)30.0);
        xValues.add((float)34.0);
        xValues.add((float)43.0);
        xValues.add((float)48.0);
        xValues.add((float)52.0);
        xValues.add((float)57.0);
        xValues.add((float)58.0);    
    }
    private void addYValues(){
        yValues.add((float)651);
        yValues.add((float)762);
        yValues.add((float)856);
        yValues.add((float)1063);
        yValues.add((float)1190);
        yValues.add((float)1298);
        yValues.add((float)1421);
        yValues.add((float)1440);
        yValues.add((float)1518);
    
    
    
    
    
    }
    private float calcularMedia(ArrayList<Float> values){
        float media =0;
        for(int i=0;i<values.size();i++){
            media += values.get(i);
        }
        return media/9;
    }
    private float calcularPendiente(){
        float auxiliarX=0,auxiliarY=0,resultado=0,auxiliarDiv;
        for(int i=0;i<xValues.size();i++){
            auxiliarX += (xValues.get(i)- mediaX)*(yValues.get(i)- mediaY);
            auxiliarY += (xValues.get(i)- mediaX)*(xValues.get(i)- mediaX) ;
        }
        return auxiliarX/auxiliarY;
        
    }
    private float calcularInterseccion(){
        return mediaY - (mediaX*pendiente);
    }
}
