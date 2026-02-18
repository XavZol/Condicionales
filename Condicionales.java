
import javax.swing.JOptionPane;

/* Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.*/

public class Condicionales {

    public static void main(String[] args) {
        int numeroSueldos;
        float sueldo, sueldoMax=0;

        numeroSueldos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos que quiere introducir"));

        for(int i=1; i<=numeroSueldos; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo N°"+i+": "));

            if(sueldo > sueldoMax) {
                sueldoMax = sueldo; //120
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo máximo es: "+sueldoMax);
    }
}
