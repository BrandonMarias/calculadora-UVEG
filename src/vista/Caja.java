
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Caja extends JTextField{
    public Caja(){
        this.setBounds(20, 20, 335, 50);
        this.setText("");
        this.setBackground(Color.WHITE);
        this.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 20));
        this.setHorizontalAlignment(SwingConstants.RIGHT);
    }
}
