package com.sistemadegestion.sistemadegestion;

public class EmpleadoTipo2 extends Empleados{
    
    
    public EmpleadoTipo2(String nombre, int edad, int antiguedad){
        super(nombre, edad, antiguedad,tipo=2);
        
        
        actividades.add("Vender Productos");
        actividades.add("Descansar");
        actividades.add("sentarse");
          

    }   
    
    @Override
    public String recibirPago() {
        // aqui va a mostrar pagos
        return null;
    }
}
