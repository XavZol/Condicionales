
import javax.swing.JOptionPane;



/* Hacer un programa que diga si dos numeros son pares o impares
Condicionales compuestos*/

public class Condicionales {

    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));

        if((numero1%2==0) && (numero2%2==0)) {
            JOptionPane.showMessageDialog(null, "Ambos números son pares.");
        } else if ((numero1%2!=0) && (numero2%2!=0)) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares.");
        } else {
            JOptionPane.showMessageDialog(null, "Algún número es par y el otro es impar.");
        }
    }
}
