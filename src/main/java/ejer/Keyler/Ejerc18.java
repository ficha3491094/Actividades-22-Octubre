/*Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
cuadrado dado uno de sus lados P = 4 · a
A= a2*/
 
  
package ejer.Keyler;

import javax.swing.JOptionPane;

public class Ejerc18 {

    public static void main(String[] args) {
        
        float perimetro,area ,lado;
        
        
        lado=Float.parseFloat(JOptionPane.showInputDialog("DIGITE uno de sus LADOS"));
        
        perimetro=4*lado;
       
        area= lado*lado;
        
        JOptionPane.showMessageDialog(null, "El area de de su cuadrado es de :"+area);
        JOptionPane.showMessageDialog(null, "El perimetro de de su cuadradoo es de :"+perimetro);
    }
    
}
