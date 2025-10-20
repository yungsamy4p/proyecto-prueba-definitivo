/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class Empleado {
    private String nombre;
    private double horas;
    private double pago;

    // Constructor vacío
    public Empleado() {}

    // Constructor completo
    public Empleado(String nombre, double horas, double pago) {
        this.nombre = nombre;
        this.horas = horas;
        this.pago = pago;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getHoras() { return horas; }
    public void setHoras(double horas) { this.horas = horas; }

    public double getPago() { return pago; }
    public void setPago(double pago) { this.pago = pago; }
}
