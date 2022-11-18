package Empleados;
import java.util.ArrayList;
import pagos.Pagos;
public class EmpleadoTipo3 {
    String nombre;
    int edad, antiguedad, tipo;
    ArrayList<String> actividades = new ArrayList<String>();
    
    public EmpleadoTipo3(String nombre, int edad, int antiguedad){
        this.nombre=nombre;
        this.edad=edad;
        this.antiguedad=antiguedad;
        this.tipo=3;
            
        actividades.add("No puede realizar actividades");        

    }   
    Pagos recibePago = new Pagos(){

        @Override
        public String recibirPago() {
            // aqui va a mostrar pagos
            return null;
        }

    };
}
