package com.sistemadegestion.sistemadegestion;

import java.util.ArrayList;

public abstract class Empleados extends SistemadegestionApplication{
    
    int edad, antiguedad;
    
    ArrayList<String> actividades = new ArrayList<String>();

    public Empleados(String nombre, int edad, int antiguedad){
        this.nombre=nombre;
        this.edad=edad;
        this.antiguedad=antiguedad;
        this.setTipo(1);
    }
    public abstract String recibirPago();

}

