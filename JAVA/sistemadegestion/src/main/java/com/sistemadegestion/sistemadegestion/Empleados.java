package com.sistemadegestion.sistemadegestion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleados extends SistemadegestionApplication{
    protected static int tipo;
    int edad, antiguedad;
    String nombre;
    ArrayList<String> actividades = new ArrayList<String>();

    public Empleados(String nombre, int edad, int antiguedad,int tipo){
        this.tipo=tipo;
        this.nombre=nombre;
        this.edad=edad;
        this.antiguedad=antiguedad;
        this.generaLista();
        
    }
    public void setTipo(int a){
        this.tipo=a;
    }
    public abstract String recibirPago();

    public void generaLista(){

        Utileria utl = new Utileria();
        String lista = utl.obtenerListaEmpleados(); //obtenemos lista de listaEmpleados.txt
        
        
         //Para cambiar datos 
        
        File file = new File("listaEmpleados.txt");
        
    
        List<String> listaProductos = new ArrayList<String>();// se meten los datos en un arraylist
        listaProductos.add(nombre);
        listaProductos.add(String.valueOf(this.tipo));
        listaProductos.add(String.valueOf(this.edad));
        listaProductos.add(String.valueOf(this.antiguedad));

        if(lista==""){
            for (int i = 0; i < listaProductos.size(); i++) {
                if(i<=listaProductos.size()-2){
                    lista += listaProductos.get(i)+",";
                    
                }else{
                    lista += listaProductos.get(i);
                }
                
            }
            System.out.println(lista);
        }else{
            for (int i = 0; i < listaProductos.size(); i++) {
                lista += ","+listaProductos.get(i);
            }
            

        }
        //Para cambiar datos en "lista.txt"
        try (FileWriter f = new FileWriter(file)) {
            f.write(lista);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}

