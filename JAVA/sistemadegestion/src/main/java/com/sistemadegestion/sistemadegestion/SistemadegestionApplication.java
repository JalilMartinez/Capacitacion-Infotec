package com.sistemadegestion.sistemadegestion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public abstract class SistemadegestionApplication {

    private int tipo, tipoP;
    int contador=0;
    String nombre;
    ArrayList<String> tipos = new ArrayList<String>();


	public void setTipo(int a){
        this.tipo=a;
    }

	public int setTipoProducto(){
        TipoProducto tipos = new TipoProducto();
        tipos=this.obtenerTipos();
        
        
        tipos=this.realizaComparaciones(tipos);

        // tipos.setProducto1("hola");
        this.actualizaTipos(tipos);
        return this.tipoP;
        
    }

    public TipoProducto obtenerTipos(){
        Gson gson = new Gson();
		String jsonfinal = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("tipo.json"));
            
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
       
		TipoProducto datos = gson.fromJson(jsonfinal, TipoProducto.class);//se transforma json a un objeto
		
		
		
        return datos;

    }
    public void actualizaTipos(TipoProducto a){
         //Para cambiar datos 
        TipoProducto datos = new TipoProducto();
        Gson gson = new Gson();
        datos=a;
		String jsonjava = gson.toJson(datos);

		try (FileWriter file = new FileWriter("tipo.json")) {
			file.write(jsonjava);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public int[] generaNumeroRandom(){
        int numero[] = {5,2,15,4,12,8,19,3,17,1,14,6,18,7,10,13,20,9,11,16};
        return numero;
    }
    public int convierteStringAint(String a){
        int i = Integer.parseInt(a);
        return i;
    }
    public TipoProducto realizaComparaciones(TipoProducto a){

        int tipos[] = a.generaArray();
        int contador = 0;
        int contador1 = 0;
        int b[];

        actualiza:
        for (int i = 0; i < tipos.length; i++) {
            if(contador == 0){
                contador1 ++;
                if(tipos[i]==0){
                    do {
                        b = this.generaNumeroRandom();
                        for (int j = 0; j < b.length  ; j++) {
                            if (b[j] != tipos[j]) {
                                tipos[i]=b[j];
                                contador ++;
                                continue actualiza;   
                            }
                        }
                    } while (tipos[i]==0);
                                  
                }
            }
            else{
                break;
            } 
        }
        contador = 0;
        
        a.actualizaProductos(tipos);
        
        // if(this.convierteStringAint(tipos.getProducto1()) == 0){

        //     do {
        //         b = this.generaNumeroRandom();
        //     } while (this.convierteStringAint(tipos.getProducto1()) == b);
        //     this.tipoP=b;
        //     tipos.setProducto1(String.valueOf(b));
        // }else if(this.convierteStringAint(tipos.getProducto2()) == 0){
        //     do {
        //         b = this.generaNumeroRandom();
        //     } while (this.convierteStringAint(tipos.getProducto1()) == b);
        //     this.tipoP=b;
        //     tipos.setProducto2(String.valueOf(b));
        // }

        return a;
    }

	public static void main(String[] args) {
		Empleados empleado1 = new EmpleadoTipo1("JALIL", 15, 10);
        Empleados empleado2 = new EmpleadoTipo2("Maza", 45, 15);
		Productos jabon = new Productos("Jabon");
		Productos jabon1 = new Productos("Jabon");
		Productos jabon2 = new Productos("Jabon");


        
        
            
        
       
	}

}
