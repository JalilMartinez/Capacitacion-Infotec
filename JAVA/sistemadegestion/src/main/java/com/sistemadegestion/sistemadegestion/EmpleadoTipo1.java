package com.sistemadegestion.sistemadegestion;

public class EmpleadoTipo1 extends Empleados{
    
    
    public EmpleadoTipo1(String nombre, int edad, int antiguedad){
        super(nombre, edad, antiguedad);
        this.setTipo(1);
        // EmpleadoTipo2 tipo=new EmpleadoTipo2(nombre, edad, antiguedad);
        actividades.add("Vender Productos");
        actividades.add( "Acomodar productos");
        actividades.add( "Descansar");
        actividades.add( "Sentarse");
         

    }   
    @Override
    public String recibirPago() {
            // aqui va a mostrar pagos
         return null;
    }
}
