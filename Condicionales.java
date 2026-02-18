
import javax.swing.JOptionPane;



/* Hacer un programa que pese de Kg a otra unidad de medida de masa, mostrar en pantalla 
un menú con las opciones posibles.*/

public class Condicionales {

    public static void main(String[] args) {
        float medida;
        int opcion;

        medida = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos: "));

        opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU\n" + "1. Hectogramos\n" + "2. Decagramos\n" + "3. Gramos\n" + "4. Decigramos\n" + "5. Centigramos\n" + "6. Miligramos"));

        switch(opcion) {
            case 1: medida *= 10;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Hectogramo es: "+medida);
                    break;
            case 2: medida *= 100;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Decagramo es: "+medida);
                    break;
            case 3: medida *= 1000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Gramo es: "+medida);
                    break;
            case 4: medida *= 10000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Decigramo es: "+medida);
                    break;
            case 5: medida *= 100000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Centigramo es: "+medida);
                    break;
            case 6: medida *= 1000000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en Miligramo es: "+medida);
                    break;
            default: JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
        }
    }
}
