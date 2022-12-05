import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empleado {
    private String nombre, apellidos;
    private ArrayList<String> actividades = new ArrayList<String>();
    private int edad, codigoEmpleado;

    public Empleado(String nombre, String apellidos, int edad, int codigoEmpleado){
        this.nombre=nombre;
        this.apellidos=apellidos;
      
        this.edad=edad;
        this.codigoEmpleado=codigoEmpleado;

    }

    public Empleado(String nombre, String apellidos, int edad) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        
    }

    void setCodigoEmpleado(int codigo){
        this.codigoEmpleado=codigo;
    }
    void setActividadesDiarias(ArrayList<String> arrayList){
        this.actividades=arrayList;
    }
    String getNombre(){
        return this.nombre;
    }

    public static void main(String[] args) {
        
        Diseñador dis = new Diseñador("JAL", "MARTINEZ", 22);
        Diseñador dis2 = new Diseñador("Victor", "MARTINEZ", 35);
        
        programador pro = new programador("Mildred", "maz", 20);


        System.out.println("\n Diseñador \n Nombre : "+dis.getNombre()+"\n Actividades:");
        System.out.println( dis.getActividadesDiarias());

        System.out.println("\n Diseñador \n Nombre : "+dis2.getNombre()+"\n Actividades:");
        System.out.println( dis2.getActividadesDiarias());

        System.out.println("\n Programador \n Nombre : "+pro.getNombre()+" \n Actividades");
        System.out.println(pro.getActividadesDiarias());

        int contador$=23;

    }
}