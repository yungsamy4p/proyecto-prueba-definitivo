/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

import java.util.ArrayList;

/**
 *
 * @author Santo Tomas
 */

public class Pais {
    private String nombre;
    private String continente;
    private String region;
    private double superficie;
    private int anioIndependencia;
    private long poblacion;
    private double expectativaVida;
    private double productoNacionalBruto;
    private String formaGobierno;
    private String jefeEstado;
    private String ciudadCapital;
    private String codigoPais;
    private ArrayList<IdiomaPais> idiomas;
    private ArrayList<Ciudad> ciudades;


    public Pais() {
        this.ciudades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }


    /// ---- SOLO SE USARÁ (CIUDAD, CONTINENTE, NOMBRE, CODIGO)
    
    public Pais(String nombre, String continente, String region, double superficie, int anioIndependencia,
                long poblacion, double expectativaVida, double productoNacionalBruto,
                String formaGobierno, String jefeEstado, String ciudadCapital, String codigoPais) {
        
        this.nombre = nombre;
        this.continente = continente;
        this.region = region;
        this.superficie = superficie;
        this.anioIndependencia = anioIndependencia;
        this.poblacion = poblacion;
        this.expectativaVida = expectativaVida;
        this.productoNacionalBruto = productoNacionalBruto;
        this.formaGobierno = formaGobierno;
        this.jefeEstado = jefeEstado;
        this.ciudadCapital = ciudadCapital;
        this.codigoPais = codigoPais;
        this.ciudades = new ArrayList<>();
        this.idiomas = new ArrayList<>();
    }

    /// ---- Getters y Setters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContinente() { return continente; }
    public void setContinente(String continente) { this.continente = continente; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public double getSuperficie() { return superficie; }
    public void setSuperficie(double superficie) { this.superficie = superficie; }

    public int getAnioIndependencia() { return anioIndependencia; }
    public void setAnioIndependencia(int anioIndependencia) { this.anioIndependencia = anioIndependencia; }

    public long getPoblacion() { return poblacion; }
    public void setPoblacion(long poblacion) { this.poblacion = poblacion; }

    public double getExpectativaVida() { return expectativaVida; }
    public void setExpectativaVida(double expectativaVida) { this.expectativaVida = expectativaVida; }

    public double getProductoNacionalBruto() { return productoNacionalBruto; }
    public void setProductoNacionalBruto(double productoNacionalBruto) { this.productoNacionalBruto = productoNacionalBruto; }

    public String getFormaGobierno() { return formaGobierno; }
    public void setFormaGobierno(String formaGobierno) { this.formaGobierno = formaGobierno; }

    public String getJefeEstado() { return jefeEstado; }
    public void setJefeEstado(String jefeEstado) { this.jefeEstado = jefeEstado; }

    public String getCiudadCapital() { return ciudadCapital; }
    public void setCiudadCapital(String ciudadCapital) { this.ciudadCapital = ciudadCapital; }

    public String getCodigoPais() { return codigoPais; }
    public void setCodigoPais(String codigoPais) { this.codigoPais = codigoPais; }

    public ArrayList<Ciudad> getCiudades() { return ciudades; }
    public void setCiudades(ArrayList<Ciudad> ciudades) { this.ciudades = ciudades; }

    public ArrayList<IdiomaPais> getIdiomas() { return idiomas; }
    public void setIdiomas(ArrayList<IdiomaPais> idiomas) { this.idiomas = idiomas; }

    @Override
    public String toString() {
        return "País: " + nombre + " (" + codigoPais + ") - " + continente + ", Población: " + poblacion;
    }
}
