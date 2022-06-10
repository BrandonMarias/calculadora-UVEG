package vista;

import javax.swing.JFrame;
import controlador.Operaciones;

public class Ventana extends JFrame {

    public Ventana() {
        this.setSize(390, 470);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Mi Calculadora");
        this.pintarCalculadora();
        
       
    }
    
    private void pintarCalculadora(){
        Panel panel = new Panel();
        this.getContentPane().add(panel);
        
        Caja caja = new Caja();
        panel.add(caja);
        
        Operaciones operaciones = new Operaciones(caja);
        
        Boton btn1 = new Boton("1",1,1);
        Boton btn2 = new Boton("2",2,1);
        Boton btn3 = new Boton("3",3,1);
        Boton btnSumar = new Boton("+",4,1,true);
        Boton btn4 = new Boton("4",1,2);
        Boton btn5 = new Boton("5",2,2);
        Boton btn6 = new Boton("6",3,2);
        Boton btnRestar = new Boton("-",4,2,true);
        Boton btn7 = new Boton("7",1,3);
        Boton btn8 = new Boton("8",2,3);
        Boton btn9 = new Boton("9",3,3);
        Boton btnMultiplicar = new Boton("*",4,3,true);
        Boton btnC = new Boton("C",1,4,true);
        Boton btn0 = new Boton("0",2,4);
        Boton btnIgual = new Boton("=",3,4,true);
        Boton btnDividir = new Boton("/",4,4,true);
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnSumar);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnRestar);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnMultiplicar);
        panel.add(btnC);
        panel.add(btn0);
        panel.add(btnIgual);
        panel.add(btnDividir);
        
        panel.updateUI();
    }
}
