/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Diagram {
    public ArrayList<Layer> layer = new ArrayList<Layer>();
    public void addLayer(Layer x ){
        layer.add(x);
    }
    public void deleteCircle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteCircle();
        }
    }
     public void deleteTriangle(){
        for(int i = 0; i < layer.size(); ++i){
            layer.get(i).deleteTriangle();
        }
    }
}

