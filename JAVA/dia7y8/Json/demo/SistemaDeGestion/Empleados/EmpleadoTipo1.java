package Empleados;
import java.util.ArrayList;

import pagos.Pagos;

public class EmpleadoTipo1 {
    String nombre;
    int edad, antiguedad, tipo;
    ArrayList<String> actividades = new ArrayList<String>();
    
    public EmpleadoTipo1(String nombre, int edad, int antiguedad){
        this.nombre=nombre;
        this.edad=edad;
        this.antiguedad=antiguedad;
        this.tipo=1;
        
        actividades.add("Vender Productos");
        actividades.add( "Acomodar productos");
        actividades.add( "Descansar");
        actividades.add( "Sentarse");
         

    }   
    Pagos recibePago = new Pagos(){

        @Override
        public String recibirPago() {
            // aqui va a mostrar pagos
            return null;
        }

    };
}
