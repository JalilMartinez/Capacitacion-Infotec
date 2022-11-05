
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Diseñador extends Empleado{

    private String herramientaDiseño[]={"Photoshop"};
    private ArrayList<String> actividadesDiarias = new ArrayList<String>(Arrays.asList("Reuniones de Avance","Elaboracion de diseño para paginas web","Presentacion-ajustes del diseño") );
    ArrayList<String> copiaActividades = new ArrayList<String>( );;
    int codigo=8000;
    String nombre = "";
    

    
    public Diseñador(String nombre, String apellidos, int edad){

        super(nombre, apellidos,edad);
        this.nombre=nombre;
        this.setCodigoEmpleado(800);
        this.setActividadesDiarias(compruebaActividades(edad));
    }

    public ArrayList<String> compruebaActividades(int edad){
        this.compruebaEdad(edad);
        Collections.sort(actividadesDiarias);//se ordenan las actividades
       
        
        return actividadesDiarias;

    }


    public void compruebaEdad(int edad){
        if(edad<=25){// si es menor o igual a 25 tiene una actividad
           this.actividadesDiarias.add("Revisión de diseñador SR");

        }else{// si es mayor a 25 tiene una actividad
            this.actividadesDiarias.add("Apoyo a diseñador JR");
        }
    }

    
    public ArrayList<String> getActividadesDiarias(){
        
        return this.actividadesDiarias;
    }

    public String getNombre(){
        return nombre;
    }
    
}
