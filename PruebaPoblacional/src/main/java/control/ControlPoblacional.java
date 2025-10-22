/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author samue
 */

import modelo.Pais;
import modelo.Ciudad;
import java.util.ArrayList;
import java.util.Comparator; 
import java.util.stream.Collectors; 
import javax.swing.table.DefaultTableModel;

public class ControlPoblacional {
    
    private ArrayList<Pais> listaPaises;

    public ControlPoblacional() {
        listaPaises = new ArrayList<>();

    }

    public void agregarPais(Pais pais) {
        listaPaises.add(pais);
    }

    public Pais buscarPaisPorCodigo(String codigo) {
        for (Pais p : listaPaises) {
            if (p.getCodigoPais().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean modificarPais(String codigo, Pais nuevo) {
        for (int i = 0; i < listaPaises.size(); i++) {
            if (listaPaises.get(i).getCodigoPais().equalsIgnoreCase(codigo)) {
                nuevo.setCiudades(listaPaises.get(i).getCiudades());
                nuevo.setIdiomas(listaPaises.get(i).getIdiomas());
                listaPaises.set(i, nuevo);
                return true;
            }
        }
        return false;
    }
    

    public boolean agregarCiudadAPais(String codigoPais, Ciudad ciudad) {
        Pais pais = buscarPaisPorCodigo(codigoPais);
        if (pais != null) {
            pais.getCiudades().add(ciudad);
            return true;
        }
        return false;
    }
    

    public Pais buscarPaisPorNombre(String nombre) {
        for (Pais p : listaPaises) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }


    public Ciudad buscarCiudadPorNombre(String nombre) {
        for (Pais pais : listaPaises) {
            for (Ciudad ciudad : pais.getCiudades()) {
                if (ciudad.getNombre().equalsIgnoreCase(nombre)) {
                    return ciudad;
                }
            }
        }
        return null;
    }


    public ArrayList<Pais> listarPaisesPorContinente(String continente) {
        return listaPaises.stream()
                .filter(pais -> pais.getContinente().equalsIgnoreCase(continente))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    
    public ArrayList<Ciudad> obtenerCiudadesDePais(String codigoPais) {
        Pais pais = buscarPaisPorCodigo(codigoPais);
        if (pais != null) {
            return pais.getCiudades();
        }
        return new ArrayList<>();
    }
    

    public ArrayList<Pais> listarPaisesPorAnioIndependencia() {
        return listaPaises.stream()
                .sorted(Comparator.comparingInt(Pais::getAnioIndependencia))
                .collect(Collectors.toCollection(ArrayList::new));
    }


    public ArrayList<Ciudad> listarCiudadesMasPobladas(int limite) {
        ArrayList<Ciudad> todasLasCiudades = new ArrayList<>();
        for (Pais pais : listaPaises) {
            todasLasCiudades.addAll(pais.getCiudades());
        }
        

        return todasLasCiudades.stream()
                .sorted(Comparator.comparingLong(Ciudad::getPoblacion).reversed())
                .limit(limite)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public DefaultTableModel obtenerModeloTabla(ArrayList<Pais> listaFiltrada) {
    String[] columnas = {"Código", "Nombre", "Continente", "Población"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    for (Pais p : listaFiltrada) { 
        Object[] fila = {
            p.getCodigoPais(),
            p.getNombre(),
            p.getContinente(),
            p.getPoblacion()
        };
        modelo.addRow(fila);
    }
    return modelo;
}
    
    public DefaultTableModel obtenerModeloTabla() {
        String[] columnas = {"Código", "Nombre", "Continente", "Población"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Pais p : this.listaPaises) { 
            Object[] fila = {
                p.getCodigoPais(),
                p.getNombre(),
                p.getContinente(),
                p.getPoblacion()
            };
            modelo.addRow(fila);
        }
        return modelo;
    }
}