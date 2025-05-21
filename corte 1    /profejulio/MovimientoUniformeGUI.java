package fisica;

import javax.swing.*;

public class MovimientoUniformeGUI extends JFrame {
    public MovimientoUniformeGUI() {
        setTitle("Simulación Movimiento Uniforme");
        setSize(300, 200);
        setLayout(null);

        JLabel lblVelocidad = new JLabel("Velocidad (m/s):");
        JTextField campoVel = new JTextField();
        JLabel lblTiempo = new JLabel("Tiempo (s):");
        JTextField campoTiempo = new JTextField();
        JButton botonResultado = new JButton("Calcular");

        lblVelocidad.setBounds(10, 10, 120, 25);
        campoVel.setBounds(140, 10, 100, 25);
        lblTiempo.setBounds(10, 40, 120, 25);
        campoTiempo.setBounds(140, 40, 100, 25);
        botonResultado.setBounds(90, 80, 100, 30);

        add(lblVelocidad);
        add(campoVel);
        add(lblTiempo);
        add(campoTiempo);
        add(botonResultado);

        botonResultado.addActionListener(e -> {
            try {
                double velocidad = Double.parseDouble(campoVel.getText());
                double tiempo = Double.parseDouble(campoTiempo.getText());
                double distancia = velocidad * tiempo;
                JOptionPane.showMessageDialog(this, "Distancia recorrida = " + distancia + " m");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        });

        setVisible(true);
    }
}
