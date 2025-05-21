package fisica;

import javax.swing.*;

public class Movimiento2DGUI extends JFrame {
    public Movimiento2DGUI() {
        setTitle("Trayectoria en 2D");
        setSize(350, 250);
        setLayout(null);

        JLabel lblVelInicial = new JLabel("Velocidad inicial (m/s):");
        JTextField txtVelInicial = new JTextField();
        JLabel lblAngulo = new JLabel("Ángulo de lanzamiento (°):");
        JTextField txtAngulo = new JTextField();
        JButton botonCalcular = new JButton("Calcular");

        lblVelInicial.setBounds(10, 10, 160, 25);
        txtVelInicial.setBounds(180, 10, 100, 25);
        lblAngulo.setBounds(10, 50, 160, 25);
        txtAngulo.setBounds(180, 50, 100, 25);
        botonCalcular.setBounds(110, 100, 120, 30);

        add(lblVelInicial);
        add(txtVelInicial);
        add(lblAngulo);
        add(txtAngulo);
        add(botonCalcular);

        botonCalcular.addActionListener(e -> {
            try {
                double vInicial = Double.parseDouble(txtVelInicial.getText());
                double anguloRad = Math.toRadians(Double.parseDouble(txtAngulo.getText()));
                double g = 9.8;
                double vY = vInicial * Math.sin(anguloRad);
                double vX = vInicial * Math.cos(anguloRad);
                double tiempoVuelo = (2 * vY) / g;
                double alturaMax = (vY * vY) / (2 * g);
                double distancia = vX * tiempoVuelo;

                JOptionPane.showMessageDialog(this,
                    "Tiempo total: " + tiempoVuelo + " s\nAltura máxima: " + alturaMax + " m\nAlcance: " + distancia + " m");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos.");
            }
        });

        setVisible(true);
    }
}

