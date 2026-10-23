import javax.swing.*;

public class EJERCICIO_3 {
    public static void main(String[] args){


        /*Leer un número entero y determinar mediante estructuras condicionales anidadas si el
        número es par o impar, y simultáneamente si es positivo, negativo o cero.
*/
        int numero;

        numero=Integer.parseInt(JOptionPane.showInputDialog("INGRSE UN NUMERO ENTERO"));

        if (numero%2==0){

            JOptionPane.showMessageDialog(null,"EL NUMERO ES PAR");


        }else{

            JOptionPane.showMessageDialog(null," EL NUMERO ES IMPAR");



        }
        if (numero>0){
            JOptionPane.showMessageDialog(null," EL NUMERO ES POSITIVO");

        }else if (numero<0){
            JOptionPane.showMessageDialog(null," EL NUMERO ES NEGATIVO");



        }else {
            JOptionPane.showMessageDialog(null, " EL NUMERO ES CERO");

        }

    }
}
