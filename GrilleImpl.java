/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavensudoku;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author Mme OUEDRAOGO
 */
/** * Implementation d'une grille 
 */ 
public class GrilleImpl implements Grille {  
private char[][] grille; // la grille de sudoku
    @Override
    public int getDimension() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   int dim=9;
        return dim;
    }

    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
        grille[x][y]=value;
     }

    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
        char value;
        value=grille[x][y];
        return value;
    }

    @Override
    public boolean complete() {
        char val='0';
        for (int i=0;i<getDimension();i++)
             for (int j=0;j<getDimension();j++){
                if (grille[i][j] == val)
                    return false;
             }
	return true; 
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if (x>getDimension() || y>getDimension()){
            return false;
            }
       else return true;
    }
    
    
     @Test
	 public void testGetDimension() {
	  int dim = 9;
	assertEquals(dim, getDimension());
}
    
         
    @Test
	 public void testGetValue(int x, int y) {
	  char value='0';
	assertEquals(value, getValue(x, y));
}
}
