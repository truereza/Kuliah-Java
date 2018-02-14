/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author REZA
 */
public class Lingkaran {
    int Radius;
    
    public int getRadius(){
        return Radius;
    }
    
    public void setRadius(int Radius){
        this.Radius=Radius;
    }
    
    public double getArea(){
        return 3.14 * Radius * Radius;
    }
    
    public Lingkaran(){ //default constructor
        
    }
    
    public Lingkaran(int rad){ //parameter constructor
        Radius=rad;
    }
}
