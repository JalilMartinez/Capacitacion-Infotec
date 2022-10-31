import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Ave perico = new Ave ("Pancho","Perico",12,"rojo");

        System.out.print(perico.toString());

        System.out.println("Hello world!");
    }
}

class Ave{
    String nombre;
    String raza;
    int edad;
    String color;

    //declaración del constructor de la clase
    public Ave( String nombre, String raza, int edad, String color ){
        this.nombre=nombre;
        this.raza = raza;
        this.edad=edad;
        this.color=color;

    }
    //método uno
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return ("Hola soy un pájaro, mi nombre es : "+this.getNombre()+"\n Mi edad es : " + this.edad);
    }




}