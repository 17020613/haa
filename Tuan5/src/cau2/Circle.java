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
public class Circle extends Shape {
    public double radius = 1.0;
    public final double PI = 3.14;
    //tinh chu vi
    public double chuVi(){
        return 2*PI*radius;
    }
    // tinh dien tich
    public double dienTich(){
        return PI*radius*radius;
    }
}
