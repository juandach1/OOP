import java.text.DecimalFormat;

public class EcuacionGrado4 {
    public static void resolver() {
        String inputA = JOptionPane.showInputDialog(null, "Coeficiente a (x⁴):");
        if (inputA == null) return;
        double a = Double.parseDouble(inputA);

        String inputB = JOptionPane.showInputDialog(null, "Coeficiente b (x³):");
        if (inputB == null) return;
        double b = Double.parseDouble(inputB);

        String inputC = JOptionPane.showInputDialog(null, "Coeficiente c (x²):");
        if (inputC == null) return;
        double c = Double.parseDouble(inputC);

        String inputD = JOptionPane.showInputDialog(null, "Coeficiente d (x):");
        if (inputD == null) return;
        double d = Double.parseDouble(inputD);

        String inputE = JOptionPane.showInputDialog(null, "Coeficiente e:");
        if (inputE == null) return;
        double e = Double.parseDouble(inputE);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "No es una ecuación de cuarto grado (a no puede ser 0).");
            return;
        }

        double x = buscarRaizReal(a, b, c, d, e);
        DecimalFormat df = new DecimalFormat("#.####");

        String resultado;
        if (Double.isNaN(x)) {
            resultado = "No se encontró una raíz real aproximada en el intervalo [-100, 100].";
        } else {
            resultado = "Raíz real aproximada: x = " + df.format(x)
                    + "\n(Puede haber más raíces reales o complejas)";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}