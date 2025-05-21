
import javax.swing.*;

public class CalculadoraEcuaciones {
    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog(null,
                "¿Qué grado de ecuación deseas resolver? (1 a 4)\n(Cancelar para salir)", "Grado de la ecuación",
                JOptionPane.QUESTION_MESSAGE);

            if (input == null) break; // usuario canceló

            int grado = Integer.parseInt(input);

            switch (grado) {
                case 1 -> EcuacionGrado1.resolver();
                case 2 -> EcuacionGrado2.resolver();
                case 3 -> EcuacionGrado3.resolver();
                case 4 -> EcuacionGrado4.resolver();
                default -> JOptionPane.showMessageDialog(null, "Por favor, elige un grado entre 1 y 4.");
            }
        }

        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }
}