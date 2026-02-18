
import javax.swing.JOptionPane;



/* Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula */

public class Condicionales {

    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra:").charAt(0);

        if(Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra MAYUSCULA");
        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
