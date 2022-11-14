package com.sistemadegestion.sistemadegestion;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;



public class Productos extends SistemadegestionApplication{
    int precio, cantidad;
    protected int tipoP;
    
    String nombre;
    public Productos(String nombre){
        this.nombre=nombre;
        tipoP=this.setTipoProducto();
        this.setPrecio();
        this.setCantidad();
        this.generaLista();
        

    }

    public int getTipo(){
        return this.tipoP;
    }
    public void setPrecio(){
        
        // Instanciamos la clase Random
        Random random = new Random();
        // Vamos a generar 1 numero aleatorio entre 300 y 500
        int randomNumber = 300 + random.nextInt(501-300);
        this.precio=randomNumber;
            

    }

    public void setCantidad(){
        // Instanciamos la clase Random
        Random random = new Random();
        // Vamos a generar 1 numero aleatorio entre 10 y 15
        int randomNumber =10+ random.nextInt(16-10);
        this.cantidad=randomNumber;
    }

    public void modificaCantidad(){
        List<String> listaProductos = new ArrayList<String>();
        if (this.cantidad>0) {
            this.cantidad --;
        }else{
            System.out.println("No hay productos del tipo solicitado");
        }
        
        listaProductos.add(String.valueOf(this.tipoP));
        listaProductos.add(String.valueOf(this.cantidad));

        this.modificaListaProductos(listaProductos);
        

    }



    public int getPrecio() {
        return precio;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void generaLista(){

        Utileria utl = new Utileria();
        String lista = utl.obtenerListaProductos(); //obtenemos lista de lista.txt
        String listan;
        
         //Para cambiar datos 
        BufferedWriter bw = null;
        FileWriter fw = null;
        File file = new File("listaProductos.txt");
        
        // Map<String, String> map = new HashMap<>();
           
        //     map.put("cantidad", Integer.toString(cantidad));
        //     map.put("precio", Integer.toString(precio));
        
        // System.out.println(map);

        String j= "{ \"cantidad\" :"+cantidad + ", \"precio\" :"+precio +"}";
        List<String> listaProductos = new ArrayList<String>();
        listaProductos.add(nombre);
        listaProductos.add(String.valueOf(cantidad));
        listaProductos.add(String.valueOf(precio));


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
        
        
        // Si el archivo no existe, se crea!
        // try {
        //     fw = new FileWriter(file.getAbsoluteFile(), true);
        //     bw = new BufferedWriter(fw);
        //     bw.write(j);
        // } catch (IOException e1) {
        //     // TODO Auto-generated catch block
        //     e1.printStackTrace();
        // }finally {
        //     try {
        //                     //Cierra instancias de FileWriter y BufferedWriter
        //         if (bw != null)
        //             bw.close();
        //         if (fw != null)
        //             fw.close();
        //     } catch (IOException ex) {
        //         ex.printStackTrace();
        //     }
        // }
    }

    

    
}