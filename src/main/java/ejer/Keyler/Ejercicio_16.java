package ejer.Keyler;

import javax.swing.*;
public class Ejercicio_16 {
    public static void main(String[] args){

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));

        double area = 3.14 * (radio*radio);
        JOptionPane.showMessageDialog(null, "El area de tu círculo es: "+area);

    }
}

