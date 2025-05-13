import javax.swing.*;

public class Interfaz {

    // Atributos privados
    private double saldo;
    private int pin;

    // Constructor
    public Interfaz() {
        saldo = 1000.0;  // Saldo inicial
        pin = 1234;       // PIN por defecto
    }

    // Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para iniciar el cajero
    public void iniciarCajero() {
        String entradaPin = JOptionPane.showInputDialog("Introduce tu PIN:");
       
            int pinIngresado = Integer.parseInt(entradaPin);

            if (pinIngresado == pin) {
                mostrarMenu();
            } else {
                JOptionPane.showMessageDialog(null, "PIN incorrecto. Acceso denegado.");
            }
         
    }

    // Método para mostrar el menú de opciones
    private void mostrarMenu() {
        String[] opciones = {"Consultar saldo", "Depositar", "Retirar", "Salir"};
        boolean salir = false;

        while (!salir) {
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una opción:",
                    "Cajero Automático",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opciones, opciones[0]);

            switch (opcion) {
                case 0: // Consultar saldo
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
                    break;
                case 1: // Depositar
                    String cantidadDeposito = JOptionPane.showInputDialog("Introduce la cantidad a depositar:");

                        double deposito = Double.parseDouble(cantidadDeposito);
                        if (deposito > 0) {
                            saldo += deposito;
                            JOptionPane.showMessageDialog(null, "Depósito exitoso. Saldo actual: $" + saldo);
                        }
                    
                    break;
                case 2: // Retirar
                    String cantidadRetiro = JOptionPane.showInputDialog("Introduce la cantidad a retirar:");

         
                        double retiro = Double.parseDouble(cantidadRetiro);
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + saldo);
                        } else {
                            JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
                        }
                    
                    break;
                case 3: // Salir
                case JOptionPane.CLOSED_OPTION:
                    salir = true;
                    break;
                default:
                    break;
            }
        }
    }

   
}
