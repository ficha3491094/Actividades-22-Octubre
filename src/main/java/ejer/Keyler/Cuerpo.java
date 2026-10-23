package ejer.Keyler;

import javax.swing.*;
import java.text.DecimalFormat;

/* Un programa que exprese en horas, minutos y segundos un tiempo expresado
en segundos.*/
public class Cuerpo {
    public static  void main(String[] args){

        int  entrada, horas, segundos, minutos;
        entrada = (int) Double.parseDouble(JOptionPane.showInputDialog("SEGUNDOS"));

        horas =   entrada / 3600;
        segundos = entrada % 60 ;
        minutos = (entrada % 3600) / 60;


        JOptionPane.showMessageDialog(null, "H  " + horas
        + " M " + minutos + "  S " + segundos);
    }
}
