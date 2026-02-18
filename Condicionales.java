
import javax.swing.JOptionPane;

/* Indicar si la fecha es correcta, considerando meses de 28, 30 y 31 días. Sin años bisiestos. */
public class Condicionales {

    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if(año == 0) {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        } else if ((mes == 2) && (dia >= 1 && dia<=28)) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia>=1 && dia<=30)) {
            JOptionPane.showMessageDialog(null, "Fecha Correcta");
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia>=1 && dia<=31)) {
            JOptionPane.showMessageDialog(null, "Fecha Correcta");
        } else {
            JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
        }
    }
}
