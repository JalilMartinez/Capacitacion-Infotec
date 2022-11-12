package com.sistemadegestion.sistemadegestion;


import java.util.Random;


public class Productos extends SistemadegestionApplication{
    int precio, cantidad;
    
    public Productos(String nombre){
        this.nombre=nombre;
        this.setTipoProducto();
        this.setPrecio();
        this.setCantidad();
        

    }

    public void setPrecio(){
        
        // Instanciamos la clase Random
        Random random = new Random();
        // Vamos a generar 1 numero aleatorio entre 300 y 500
        int randomNumber = random.nextInt(501)+299;
        this.precio=randomNumber;
            

    }

    public void setCantidad(){
        // Instanciamos la clase Random
        Random random = new Random();
        // Vamos a generar 1 numero aleatorio entre 10 y 15
        int randomNumber = random.nextInt(16)+9;
        this.cantidad=randomNumber;
    }

    public void modificaCantidad(){
        if (this.cantidad>0) {
            this.cantidad --;
        }else{
            System.out.println("No hay productos del tipo solicitado");
        }

    }



    public int getPrecio() {
        return precio;
    }


    public int getCantidad() {
        return cantidad;
    }

    

    
}