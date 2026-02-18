
import javax.swing.JOptionPane;

/* Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso*/
public class Condicionales {

    public static void main(String[] args) {
        float calificacion;
        boolean haySuspenso = false;
        for (int i = 1; i <= 5; i++) {
            do {
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10: "));
            } while (calificacion < 0 || calificacion > 10);
            if (calificacion < 5) {
                haySuspenso = true;
            }
        }
        if (haySuspenso) {
            JOptionPane.showMessageDialog(null, "Hay al menos un suspenso");
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningún suspenso");
        }
    }
}
