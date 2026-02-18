

/* Hacer un programa que simule un cajero automático con un saldo inicial de $1000
con el siguiente menú de opciones:
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Mostrar el saldo disponible
4. Salir*/

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático\n" + "1. Ingresar dinero a la cuenta\n" + "2. Retirar dinero de la cuenta\n" + "3. Mostrar saldo de la cuenta\n" + "4. Salir"));

        switch(opcion) {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
                    saldoActual = saldoInicial + ingreso;
                    JOptionPane.showMessageDialog(null, "Dinero en su cuenta: "+saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));

                if(retiro>saldoInicial){
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente.");
                } else {
                    saldoActual = saldoInicial - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                }
                break;
            case 3: JOptionPane.showMessageDialog(null, "Dinero en su cuenta: "+saldoInicial);
                break;
            case 4: break;
            default: JOptionPane.showMessageDialog(null, "Se equivoco de opcion de menú");

        }
    }
}
