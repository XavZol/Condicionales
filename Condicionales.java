
import javax.swing.JOptionPane;

/* Pedir 10 números y al final mostrar si se ha introducido alguno negativo*/

public class Condicionales {

    public static void main(String[] args) {
        int numero;
        boolean numNegativo=false;
        for(int i=1; i<=10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(numero < 0) {
                numNegativo = true;
            }
        }
        if(numNegativo == true) {
            JOptionPane.showMessageDialog(null, "Si existe al menos un número negativo");
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún número negativo");
        }
    }
}
