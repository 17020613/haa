/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2;

/**
 *
 * @author lochoi
 */
public class Shape {
    public String color = "red";
    public boolean filled =true;
    
    Shape(){
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
}
