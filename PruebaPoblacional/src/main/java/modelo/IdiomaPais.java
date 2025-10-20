/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class IdiomaPais {
    private String idioma;
    private boolean esOficial;
    private double porcentajePoblacion;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEsOficial() {
        return esOficial;
    }

    public void setEsOficial(boolean esOficial) {
        this.esOficial = esOficial;
    }

    public double getPorcentajePoblacion() {
        return porcentajePoblacion;
    }

    public void setPorcentajePoblacion(double porcentajePoblacion) {
        this.porcentajePoblacion = porcentajePoblacion;
    }

    public IdiomaPais(String idioma, boolean esOficial, double porcentajePoblacion) {
        this.idioma = idioma;
        this.esOficial = esOficial;
        this.porcentajePoblacion = porcentajePoblacion;
        
    }

    @Override
    public String toString() {
        return "IdiomaPais{" + "idioma=" + idioma + ", esOficial=" + esOficial + ", porcentajePoblacion=" + porcentajePoblacion + '}';
    }
    
}
