package com.traductor.traductor;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.pattern.Util;

@SpringBootApplication
public class TraductorApplication extends Utileria{
	private String Palabra="";
	private String Ingles="";
	private String Frances="";


    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String palabra) {
        Palabra = palabra;
    }
	
    public void pidePalabra(){
        System.out.println("¿Qué palabra quieres traducir? ");
        Scanner a = new Scanner(System.in);
        String p = a.next();
        setPalabra(p);
    }
    public void imprimeTraduccion(){
        List<String> palabraTraducida = traducir();
        for (int i = 0; i < palabraTraducida.size(); i++) {
            System.out.println(palabraTraducida.get(i));
        }
    }
	public void pideTraduccion(){
		Utileria utl = new Utileria();

		utl.modificaListaPalabras(this.Palabra,this.Ingles,this.Frances);
	}
    public List<String> traducir(){
        List<String> palabraTraducida = new ArrayList<String>();
        switch (getPalabra()) {
            case "hola":
                palabraTraducida.add("hello");
                palabraTraducida.add("salut");

                break;
        
            default:
                break;
        }

        return palabraTraducida;

    }
	public static void main(String[] args) {
		
	}

}
