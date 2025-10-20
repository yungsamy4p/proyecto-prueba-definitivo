/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author samue
 */

import modelo.Empleado;
import vista.VentanaEmpleado;

public class ControlEmpleado {
    private Empleado empleado;        // el modelo (los datos)
    private VentanaEmpleado vista;    // la interfaz (la ventana)
    
    // Constructor
    public ControlEmpleado(Empleado empleado, VentanaEmpleado vista) {
        this.empleado = empleado;
        this.vista = vista;
    }
}