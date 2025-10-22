/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class Ciudad {
    
    private String nombre;
    private String pais;
    private String distrito;
    private long poblacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }
    
    
    public Ciudad(String nombre, String pais, String distrito, long poblacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.distrito = distrito;
        this.poblacion = poblacion;
        
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", pais=" + pais + ", distrito=" + distrito + ", poblacion=" + poblacion + '}';
    }
    
}
