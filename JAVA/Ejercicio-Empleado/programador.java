
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programador extends Empleado{
    private String herramientaDesarrollo[]={"Eclipse"};
    private ArrayList<String> actividadesDiarias = new ArrayList<String>(Arrays.asList("Analisis de requerimientos","Desarrollo de requerimientos", "Presentacion-pruebas unitarias") );
    int codigo=8000;
    String nombre="";
    
    public programador(String nombre, String apellidos, int edad){
        super(nombre, apellidos,edad);
        this.setCodigoEmpleado(9000);
        this.setActividadesDiarias(compruebaActividades(edad));
        this.nombre=nombre;
    }
    public ArrayList<String> compruebaActividades(int edad){
        ArrayList<String> copiaActividades = new ArrayList<String>();//creamos copia de actividades diarias
        copiaActividades=actividadesDiarias;

        
    
        for (int i = 0; i < copiaActividades.size(); i++) {
            String a=copiaActividades.get(i);//se separan actividades
            
            char[] aCaracteres = a.toCharArray();//se convierte la actividad en char
            

            for (int j = 0; j < aCaracteres.length; j++) {
                if(j==0){
                    aCaracteres[j] = ' ';//eliminamos primer caracter de la actividad
                }
                if(j==(aCaracteres.length-1)){
                    aCaracteres[j] = ' ';//eliminamos ultimo caracter de la actividad
                }
            }
            
            String b = "";
            for (int j = 0; j < aCaracteres.length; j++) {
                b+=aCaracteres[j];//formamos de nuevo la actividad
            }

            copiaActividades.set(i, b);//reemplazamos la actividad con caracteres eliminados en la lista de actividades

        }
        
        
        Collections.sort(copiaActividades);//ordenamos la lista de actividades
        return copiaActividades;

    }

    

    

    public ArrayList<String> getActividadesDiarias(){
        
        return this.actividadesDiarias;
    }

    public String getNombre(){
        return nombre;
    }
    
}
