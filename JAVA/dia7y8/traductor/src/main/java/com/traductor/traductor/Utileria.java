package com.traductor.traductor;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Utileria{

    int contador;

    public void obtenerHora(){
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        
        System.out.println("Hora actual : " + hours  + ":"+ minutes + " hr "); 
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



    public List<String> obtenerBasePalabras(){

        List<String> listaproductos = new ArrayList<String>();
        // Utileria tipos = new Utileria();
        String lista=this.obtenerListaPalabras();
        String str[] = lista.split(",");
        listaproductos = Arrays.asList(str);
        System.out.println("lista");
        System.out.println(listaproductos);

        return listaproductos;

    }

    public String obtenerListaPalabras(){
        
		String jsonfinal = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"));
            
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

    public void modificaListaPalabras(String palabra, String ingles, String frances){
        Utileria utl = new Utileria();
        String lista = utl.obtenerListaPalabras(); //obtenemos lista de lista.txt
        String listan;
        
         //Para cambiar datos 
        BufferedWriter bw = null;
        FileWriter fw = null;
        File file = new File("listaProductos.txt");
        

        List<String> listaPalabras = new ArrayList<String>();
        listaPalabras.add(palabra);
        listaPalabras.add(ingles);
        listaPalabras.add(frances);

        if(lista==""){
            for (int i = 0; i < listaPalabras.size(); i++) {
                if(i<=listaPalabras.size()-2){
                    lista += listaPalabras.get(i)+",";
                    
                }else{
                    lista += listaPalabras.get(i);
                }
                
            }
            System.out.println(lista);
        }else{
            for (int i = 0; i < listaPalabras.size(); i++) {
                lista += ","+listaPalabras.get(i);
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
