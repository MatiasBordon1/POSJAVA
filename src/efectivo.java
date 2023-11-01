/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bores
 */
public class efectivo {     
    
    public static void agregarNumero(javax.swing.JTextField jtxtDisplay, javax.swing.JButton btn) {
        String Enternumber = jtxtDisplay.getText();
        
        if (Enternumber.equals("")) {
            jtxtDisplay.setText(btn.getText());
        } else {
            Enternumber = jtxtDisplay.getText() + btn.getText();
            jtxtDisplay.setText(Enternumber);
        }
    }
    
}
