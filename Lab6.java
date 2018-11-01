/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point A = new Point(0,0);
        Point B = new Point(0,2);
        Point C = new Point(4,0);
        Point O = new Point(0,0);
        Shape cir = new Circle(O,1,"red");
        Shape squ = new Square(2,A,"yellow");
        Shape tri = new Triangle(A,B,C,"blue");
        Shape rec = new Rectangle(1,2,A,"black");
        Diagram d = new Diagram();
        Layer l = new Layer();
        d.addLayer(l);
        l.addShape(cir);
        l.addShape(squ);
        l.addShape(tri);
        l.addShape(rec);
        l.showShape();
        l.deleteTriangle();
    }
}
