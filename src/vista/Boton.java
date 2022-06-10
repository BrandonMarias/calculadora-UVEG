/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import controlador.Operaciones;

/**
 *
 * @author brand
 */
public class Boton extends JButton implements ActionListener {

    boolean operacion = false;

    public Boton(String caracter, int x, int y) {
        pintarBoton(caracter, x, y);
    }

    public Boton(String caracter, int x, int y, boolean operacion) {
        pintarBoton(caracter, x, y);
        this.operacion = operacion;
    }

    private void pintarBoton(String caracter, int x, int y) {
        this.setText(caracter);
        this.setBounds((20 + (x - 1) * 85), 80 + (y - 1) * 85, 80, 80);
        this.setBackground(Color.WHITE);
        this.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        this.addActionListener(null);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isOperacion()) {
            Operaciones.realizarOperacion(this.getText());
        }else {
            Operaciones.concatenarNumero(this.getText());
        }
    }

    public boolean isOperacion() {
        return operacion;
    }

    public void setOperacion(boolean esOperacion) {
        this.operacion = esOperacion;
    }
    
}
