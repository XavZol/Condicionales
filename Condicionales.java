
import javax.swing.JOptionPane;



/* Dadas las 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.*/

public class Condicionales {

    public static void main(String[] args) {
        float nota;
        int aprobados=0, condicionados=0, suspensos=0;

        for(int i=1; i<=6; i++) {
            do { 
                nota = Float.parseFloat(JOptionPane.showInputDialog("Digite una nota entre 0-10. "));
            } while(nota<0 || nota>10);

            if(nota == 4) {
                condicionados++;
            } else if(nota>=5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Aprobados: " + aprobados + "\nCondicionados: " + condicionados + "\nSuspensos: " + suspensos);
    }
}
