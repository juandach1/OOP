import javax.swing.*;
import java.text.DecimalFormat;

public class EcuacionGrado1 {
    public static void resolver() {
        String inputA = JOptionPane.showInputDialog(null, "Ingresa el coeficiente a:");
        if (inputA == null) return;
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog(null, "Ingresa el coeficiente b:");
        if (inputB == null) return;
        double b = Double.parseDouble(inputB);

        String resultado;
        DecimalFormat df = new DecimalFormat("#.####");

        if (a == 0) {
            resultado = (b == 0)
                    ? "La ecuación tiene infinitas soluciones."
                    : "La ecuación no tiene solución.";
        } else {
            double x = -b / a;
            resultado = "La solución es: x = " + df.format(x);
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}