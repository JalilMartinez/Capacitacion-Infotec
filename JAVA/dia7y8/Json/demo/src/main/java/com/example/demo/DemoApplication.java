package com.example.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.gson.Gson;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("hola xd");
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

		Persona datos = gson.fromJson(jsonfinal, Persona.class);
		
		System.out.println(datos.getTipo());
		datos.setTipo("jsonfinal");

		String jsonjava = gson.toJson(datos);

		try (FileWriter file = new FileWriter("tipo.json")) {
			file.write(jsonjava);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        System.out.println("Resultado : " + jsonfinal);
	}

}
