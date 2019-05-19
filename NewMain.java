/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensudoku;

/**
 *
 * @author Mme OUEDRAOGO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GrilleImpl gril=new GrilleImpl();
        System.out.println(gril.getDimension()); 
        
    }
    
}
