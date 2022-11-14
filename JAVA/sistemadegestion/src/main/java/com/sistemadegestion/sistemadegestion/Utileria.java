package com.sistemadegestion.sistemadegestion;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


public class Utileria{

    int contador;

    public void hacerComprobaciones(List<String> lista){
        this.mayorPrecio(lista);
        this.mayorCantidad(lista);
        this.obtenerProductosSinDisponibilidad(lista);
        this.obtenerCostos(lista);


    }

    public void mayorPrecio(List<String> lista){
        String nombreMayor=lista.get(0);

        int mayor = Integer.parseInt(lista.get(2));
        
        for (int i = 2; i < lista.size(); i+=3) {
            if(Integer.parseInt(lista.get(i))>mayor){
                mayor = Integer.parseInt(lista.get(i));
                nombreMayor = lista.get(i-2);
            }
        }

        System.out.println("El producto " + nombreMayor + " tiene el mayor precio, cuesta : "+mayor);


    }

    public void mayorCantidad(List<String>lista){
        String nombreMayor=lista.get(0);
        //se dice que la primer cantidad es la mayor
        int mayor = Integer.parseInt(lista.get(1));
        //compara cantidades
        for (int i = 1; i < lista.size(); i+=3) {
            if(Integer.parseInt(lista.get(i))>mayor){
                mayor = Integer.parseInt(lista.get(i));
                nombreMayor = lista.get(i-1);
            }
        }
        System.out.println("El producto " + nombreMayor + " tiene la mayor cantidad, tiene : "+mayor+" piezas");


    }

    public void obtenerCostos(List<String>lista){
       
        int costo = 0;
        //compara cantidades
        for (int i = 2; i < lista.size(); i+=3) {
            costo += Integer.parseInt(lista.get(i))*Integer.parseInt(lista.get(i-1));// el array es [nombre, cantidad, costo]
            // costo += costo * cantidad
        }
        System.out.println("El costo total es : "+costo );

    }
   
    public void obtenerProductosSinDisponibilidad(List<String> lista){
        List<String> listaproductosSinDisponibilidad = new ArrayList<String>();
        
        //compara cantidades
        for (int i = 1; i < lista.size(); i+=3) {// el array es [nombre, cantidad, costo]
            if(Integer.parseInt(lista.get(i))==0){// si la cantidad es 0
                listaproductosSinDisponibilidad.add(lista.get(i-1)) ;//Se agrega el nombre a la lista de "sin disponibilidad"
                // costo += costo * cantidad
            }    
        }
        if (listaproductosSinDisponibilidad.size() == 0) {
            System.out.println("Todos los productos tienen disponibilidad");
        }else{
            System.out.println("Los productos que ya no tienen disponibilidad son : ");
            for (int i = 0; i < listaproductosSinDisponibilidad.size(); i++) {
                System.out.println(listaproductosSinDisponibilidad.get(i));
            }
        }
        
        
    }   
    
    public void obtenerHora(){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        
        System.out.println("Hora actual : " + hours  + ":"+ minutes + " hr "); 
    }

    public void emliminaEmpleados3 (List<String> lista){//[nombre, tipo, edad, antiguedad]

        List<String> empleadosEliminados = new ArrayList<String>(); 
        
        for (int i = 1; i < lista.size(); i+=4) {

            if(Integer.parseInt(lista.get(i))==3){
                empleadosEliminados.add(lista.get(i-1));    
                empleadosEliminados.add(lista.get(i+1));    
                empleadosEliminados.add(lista.get(i+2));

                lista.set(i-1, "0");
                lista.set(i, "0");
                lista.set(i+1, "0");
                lista.set(i+2, "0");   
            }
        }

        System.out.println("Los empleados eliminados son : " );
        for (int i = 0; i < empleadosEliminados.size(); i++) {
            if(i==0){
                System.out.println("\t Nombre : "+empleadosEliminados.get(i));
            }else if(i==1){
                System.out.println("\t Edad : "+empleadosEliminados.get(i));
            }else if(i==2){
                System.out.println("\t Antiguedad : "+empleadosEliminados.get(i));
            }
            
        }
        this.modificaListaEmpleados(empleadosEliminados);
    }

    public String cadenaMayusculas(String a){
        String nuevaCadena ="";
        nuevaCadena=a.toUpperCase();
        return nuevaCadena;
    }
    public String cadenaMinusculas(String a){
        String nuevaCadena ="";
        String cadenaInvertida="";
        nuevaCadena=a.toLowerCase();
        for (int x = nuevaCadena.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + nuevaCadena.charAt(x);
        
        return cadenaInvertida;
    }

    

    public List<String> obtenerBaseProductos(){

        List<String> listaproductos = new ArrayList<String>();
        // Utileria tipos = new Utileria();
        String lista=this.obtenerListaProductos();
        String str[] = lista.split(",");
        listaproductos = Arrays.asList(str);
        System.out.println("lista");
        System.out.println(listaproductos);

        return listaproductos;
       
        
        
        
    }

    public String obtenerListaProductos(){
        
		String jsonfinal = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("listaProductos.txt"));
            
            String linea ="";

            try {
                while((linea = br.readLine()) != null){
                    jsonfinal += linea;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jsonfinal;
       
    }

    public List<String> obtenerBaseEmpleados(){

        List<String> listaempleados = new ArrayList<String>();
        // Utileria tipos = new Utileria();
        String lista=this.obtenerListaEmpleados();
        String str[] = lista.split(",");
        listaempleados = Arrays.asList(str);
        System.out.println("lista");
        System.out.println(listaempleados);

        return listaempleados;
       
        
        
        
    }

    public String obtenerListaEmpleados(){
        
		String jsonfinal = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("listaEmpleados.txt"));
            
            String linea ="";

            try {
                while((linea = br.readLine()) != null){
                    jsonfinal += linea;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jsonfinal;
       
    }
    
    public void modificaListaEmpleados(List<String> lista){

    }
    public void modificaListaProductos(List<String> lista){

    }
    

}
