/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciounitarias;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Steven
 */
public class Persona {
    public int identificacionA;
    public String nombre;
    public String apellido;
    public Map<Integer,Persona> personaMap = new HashMap();
    /**
     * constructor persona
     * @param identificacionA
     * @param nombre
     * @param apellido 
     */
    public Persona(int identificacionA, String nombre, String apellido) {
        this.identificacionA = identificacionA;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdentificacionA() {
        return identificacionA;
    }

    public void setIdentificacionA(int identificacionA) {
        this.identificacionA = identificacionA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Map<Integer, Persona> getPersonaMap() {
        return personaMap;
    }

    public void setPersonaMap(Map<Integer, Persona> personaMap) {
        this.personaMap = personaMap;
    }
}
