
import javax.swing.JOptionPane;



/*Descuento de 20% a los clientes que superen los $300*/

public class Condicionales {

    public static void main(String[] args) {
        float precioCompra, descuento;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio de compra: "));

        if(precioCompra > 300) {
            descuento = precioCompra * 0.2f;
            precioCompra -= descuento;
            JOptionPane.showMessageDialog(null, "El precio de compra con descuento es: "+precioCompra);
        } else {
            JOptionPane.showMessageDialog(null, "El precio de compra es: "+precioCompra);
        }
    }
}
