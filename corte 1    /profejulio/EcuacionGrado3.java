import javax.swing.*;
import java.text.DecimalFormat;

public class EcuacionGrado3 {
    public static void resolver() {
        String inputA = JOptionPane.showInputDialog(null, "Coeficiente a (x³):");
        if (inputA == null) return;
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog(null, "Coeficiente b (x²):");
        if (inputB == null) return;
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog(null, "Coeficiente c (x):");
        if (inputC == null) return;
        double c = Double.parseDouble(inputC);

        String inputD = JOptionPane.showInputDialog(null, "Coeficiente d:");
        if (inputD == null) return;
        double d = Double.parseDouble(inputD);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No es una ecuación de tercer grado (a no puede ser 0).");
            return;
        }

      
        JOptionPane.showMessageDialog(null, resultado);
    }
}