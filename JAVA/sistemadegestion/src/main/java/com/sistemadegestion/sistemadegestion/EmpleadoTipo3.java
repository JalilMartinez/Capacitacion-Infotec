package com.sistemadegestion.sistemadegestion;

public class EmpleadoTipo3 extends Empleados{
    
    
    public EmpleadoTipo3(String nombre, int edad, int antiguedad){
        super(nombre, edad, antiguedad,tipo=3);
        
            
        actividades.add("No puede realizar actividades");        

    }   
    
    @Override
    public String recibirPago() {
        // aqui va a mostrar pagos
        return null;
    }
}
