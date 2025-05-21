package fisica;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MovimientoUniformementeAceleradoGUI extends JFrame {
    public MovimientoUniformementeAceleradoGUI() {
        setTitle("Movimiento Uniformemente Acelerado");
        setSize(300, 250);
        setLayout(null);

        JLabel lblVInicial = new JLabel("Vel. Inicial (m/s):");
        JTextField txtVInicial = new JTextField();
        JLabel lblAceleracion = new JLabel("Aceleración (m/s²):");
        JTextField txtAceleracion = new JTextField();
        JLabel lblTiempo = new JLabel("Tiempo (s):");
        JTextField txtTiempo = new JTextField();
        JButton btnResultado = new JButton("Calcular");

        lblVInicial.setBounds(10, 10, 150, 25);
        txtVInicial.setBounds(160, 10, 100, 25);
        lblAceleracion.setBounds(10, 50, 150, 25);
        txtAceleracion.setBounds(160, 50, 100, 25);
        lblTiempo.setBounds(10, 90, 150, 25);
        txtTiempo.setBounds(160, 90, 100, 25);
        btnResultado.setBounds(90, 130, 100, 30);

        add(lblVInicial); add(txtVInicial);
        add(lblAceleracion); add(txtAceleracion);
        add(lblTiempo); add(txtTiempo);
        add(btnResultado);

        btnResultado.addActionListener((ActionEvent e) -> {
            try {
                double vi = Double.parseDouble(txtVInicial.getText());
                double a = Double.parseDouble(txtAceleracion.getText());
                double t = Double.parseDouble(txtTiempo.getText());

                double velocidadFinal = vi + a * t;
                double desplazamiento = vi * t + 0.5 * a * t * t;

                JOptionPane.showMessageDialog(this,
                        "Velocidad final: " + velocidadFinal + " m/s\nDistancia recorrida: " + desplazamiento + " m");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: ingrese valores numéricos válidos.");
            }
        });

        setVisible(true);
    }
}
