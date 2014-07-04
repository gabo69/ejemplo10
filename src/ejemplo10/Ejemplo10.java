/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo10;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x,y,d=0;
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese numero 1"));
        y=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero 2"));
         for (int i = x; i <= y; i++) {
            d=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    d=d+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    d=0; 
              if (d==i) {
                JOptionPane.showMessageDialog(null, "El primer número perfecto ente "+ x+" y "+y+ " es = " +d);
                i=y;
                
            }
        }
            if(d==0) {
                JOptionPane.showMessageDialog(null, "no hay números perfectos "+ x+" y "+y);
            }
    }
    }
         }
    }