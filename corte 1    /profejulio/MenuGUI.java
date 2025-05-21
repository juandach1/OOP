package fisica;

import javax.swing.*;

public class MenuGUI extends JFrame {
    public MenuGUI() {
        super("Simulador de Física");
        configurarVentana();
    }

    private void configurarVentana() {
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        crearBoton("Movimiento Uniforme", 20, e -> new MovimientoUniformeGUI());
        crearBoton("Movimiento Acelerado", 60, e -> new MovimientoUniformementeAceleradoGUI());
        crearBoton("Caída Libre", 100, e -> new CaidaLibreGUI());
        crearBoton("Movimiento 2D", 140, e -> new Movimiento2DGUI());
        crearBoton("Salir", 180, e -> System.exit(0));

        setVisible(true);
    }

    private void crearBoton(String texto, int y, java.awt.event.ActionListener accion) {
        JButton boton = new JButton(texto);
        boton.setBounds(100, y, 200, 30);
        boton.addActionListener(accion);
        add(boton);
    }
}
