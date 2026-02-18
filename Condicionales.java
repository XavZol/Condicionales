
import javax.swing.JOptionPane;

/* pedir el día mes y año de una fecha e indicar si la fecha es correcta . Supioniendo que todos los meses son de
30 días*/
public class Condicionales {

    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((dia >= 1) && (dia <= 30)) {
            if ((mes >= 1) && (mes <= 12)) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
        }
    }
}
