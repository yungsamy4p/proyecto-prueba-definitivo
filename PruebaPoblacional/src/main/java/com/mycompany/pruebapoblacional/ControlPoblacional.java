/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebapoblacional;

/**
 *
 * @author samue
 */

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControlPoblacional {
    private ArrayList<Pais> listaPaises;

    public ControlPoblacional() {
        listaPaises = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        listaPaises.add(pais);
    }

    public Pais buscarPais(String codigo) {
        for (Pais p : listaPaises) {
            if (p.getCodigoPais().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void modificarPais(Pais nuevoPais) {
        for (int i = 0; i < listaPaises.size(); i++) {
            if (listaPaises.get(i).getCodigoPais().equalsIgnoreCase(nuevoPais.getCodigoPais())) {
                listaPaises.set(i, nuevoPais);
            }
        }
    }

    public DefaultTableModel obtenerModeloTabla() {
        String[] columnas = {"Código", "Nombre", "Continente", "Población"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        for (Pais p : listaPaises) {
            Object[] fila = {p.getCodigoPais(), p.getNombre(), p.getContinente(), p.getPoblacion()};
            modelo.addRow(fila);
        }
        return modelo;
    }
}