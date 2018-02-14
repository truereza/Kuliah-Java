/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import Model.Lingkaran;

/**
 *
 * @author REZA
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran L = new Lingkaran(8);
//        L.setRadius(8);
        System.out.println("Luas :" +L.getArea());
    }
    
}
