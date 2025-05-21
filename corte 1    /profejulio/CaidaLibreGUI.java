package fisica;

import javax.swing.*;

public class CaidaLibreGUI extends JFrame {
    public CaidaLibreGUI() {
        setTitle("Simulación de Caída Libre");
        setSize(300, 200);
        setLayout(null);

        JLabel etiquetaTiempo = new JLabel("Tiempo (s):");
        JTextField campoTiempo = new JTextField();
        JButton botonCalcular = new JButton("Calcular");

        etiquetaTiempo.setBounds(10, 10, 120, 25);
        campoTiempo.setBounds(140, 10, 100, 25);
        botonCalcular.setBounds(90, 60, 100, 30);

        add(etiquetaTiempo);
        add(campoTiempo);
        add(botonCalcular);

        botonCalcular.addActionListener(e -> {
            try {
                final double gravedad = 9.8;
                double tiempo = Double.parseDouble(campoTiempo.getText());
                double altura = 0.5 * gravedad * Math.pow(tiempo, 2);
                double velocidadFinal = gravedad * tiempo;

                JOptionPane.showMessageDialog(this,
                        "Altura alcanzada: " + altura + " m\nVelocidad final: " + velocidadFinal + " m/s");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida. Por favor, ingresa un número.");
            }
        });

        setVisible(true);
    }
}
