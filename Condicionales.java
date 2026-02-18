
import javax.swing.JOptionPane;

/* valor = (Condicion) ? valor1 : valor2 */

public class Condicionales {

    public static void main(String[] args) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        mensaje = (numero%2==0) ? "Es par" : "Es impar";

        JOptionPane.showMessageDialog(null, mensaje);

        // Funciona de la misma manera
        // JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es par" : "Es impar");
    }
}
