import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Traductor{
    private String Palabra="";

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String palabra) {
        Palabra = palabra;
    }

    public Traductor(){

    }
    public void pidePalabra(){
        System.out.println("¿Qué palabra quieres traducir? ");
        Scanner a = new Scanner(System.in);
        String p = a.next();
        setPalabra(p);
    }
    public void imprimeTraduccion(){
        List<String> palabraTraducida = traducir();
        for (int i = 0; i < palabraTraducida.size(); i++) {
            System.out.println(palabraTraducida.get(i));
        }
    }
    public List<String> traducir(){
        List<String> palabraTraducida = new ArrayList<String>();
        switch (getPalabra()) {
            case "hola":
                palabraTraducida.add("hello");
                palabraTraducida.add("salut");

                break;
        
            default:
                break;
        }

        return palabraTraducida;

    }

    public static void main(String[] args) {
        Traductor p = new Traductor();
        p.pidePalabra();
        p.imprimeTraduccion();
    }
    
}