
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
        for (int i = 0; i < actividadesDiarias.size(); i++) {
          
            String a=actividadesDiarias.get(i);//se separan actividades
            

            char[] aCaracteres = a.toCharArray();
            

            for (int j = 0; j < aCaracteres.length; j++) {
                if(j==0){
                    aCaracteres[j] = ' ';
                }
                if(j==(aCaracteres.length-1)){
                    aCaracteres[j] = ' ';
                }
            }
            
            String b = "";
            for (int j = 0; j < aCaracteres.length; j++) {
                b+=aCaracteres[j];
            }

            actividadesDiarias.set(i, b);

        }
        
        
        Collections.sort(actividadesDiarias);
        return actividadesDiarias;

    }


    

    public ArrayList<String> getActividadesDiarias(){
        
        return this.actividadesDiarias;
    }

    public String getNombre(){
        return nombre;
    }
    
}
