/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import control.ControlPoblacional;
import vista.VentanaPaises;

/**
 *
 * @author Santo Tomas
 */
public class PruebaPoblacional {

    public static void main(String[] args) {
    ControlPoblacional control = new ControlPoblacional();
    VentanaPaises ventana = new VentanaPaises(control);
    ventana.setVisible(true);
    
    }

}
