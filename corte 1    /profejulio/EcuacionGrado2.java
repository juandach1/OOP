import javax.swing.*;
import java.text.DecimalFormat;

public class EcuacionGrado2 {
    public static void resolver() {
        String inputA = JOptionPane.showInputDialog(null, "Ingresa el coeficiente a:");
       
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog(null, "Ingresa el coeficiente b:");
        
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog(null, "Ingresa el coeficiente c:");
    
        double c = Double.parseDouble(inputC);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No es una ecuación de segundo grado (a no puede ser 0).");
            return;
        }

        double discriminante = b * b - 4 * a * c;
        String resultado;
        DecimalFormat df = new DecimalFormat("#.####");

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            resultado = "Dos soluciones reales:\nx1 = " + df.format(x1) + "\nx2 = " + df.format(x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            resultado = "Una solución real doble:\nx = " + df.format(x);
        } else {
          JOptionPane.showMessageDialog("no tiene solucion real");
        
                    
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}