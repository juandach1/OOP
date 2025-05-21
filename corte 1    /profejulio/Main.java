package fisica;
import fisica.Movimiento2DGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Simulador de Movimiento");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setLayout(null);

        JButton botonMU = new JButton("Movimiento Uniforme");
        JButton botonMUA = new JButton("MUA");
        JButton botonCaida = new JButton("Caída Libre");
        JButton boton2D = new JButton("Movimiento en 2D");
        JButton botonSalir = new JButton("Cerrar");

        botonMU.setBounds(100, 20, 200, 30);
        botonMUA.setBounds(100, 60, 200, 30);
        botonCaida.setBounds(100, 100, 200, 30);
        boton2D.setBounds(100, 140, 200, 30);
        botonSalir.setBounds(100, 180, 200, 30);

        ventana.add(botonMU);
        ventana.add(botonMUA);
        ventana.add(botonCaida);
        ventana.add(boton2D);
        ventana.add(botonSalir);

        botonMU.addActionListener(evt -> new MovimientoUniformeGUI());
        botonMUA.addActionListener(evt -> new MovimientoUniformementeAceleradoGUI());
        botonCaida.addActionListener(evt -> new CaidaLibreGUI());
        boton2D.addActionListener(evt -> new Movimiento2DGUI());
        botonSalir.addActionListener(evt -> System.exit(0));

        ventana.setVisible(true);
    }
}
