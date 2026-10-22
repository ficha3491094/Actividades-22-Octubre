package ejer.Keyler;

import javax.swing.*;

/* Un programa que exprese en horas, minutos y segundos un tiempo expresado
en segundos.*/
public class Cuerpo {
    public static  void main(String[] args){
        double segundos, minutos , horas = 0;


        segundos = Double.parseDouble(JOptionPane.showInputDialog("SEGUNDOS"));

        minutos = segundos  / 60;
        horas = minutos / 60;

        JOptionPane.showMessageDialog(null, "SEGUNDOS" + segundos
        + "\nminutos " + minutos
        + "\nhoras " +  horas);
    }
}
