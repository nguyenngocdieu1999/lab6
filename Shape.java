/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
public class Shape {
    private String color ;
    
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }
    public Shape(){
        
    }
    public Shape(String c){
        this.color = c;
    }
}

