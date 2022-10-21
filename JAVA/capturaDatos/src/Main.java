import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su numero de telefono: ");
        String numero = lectura.next();
        System.out.println("Ingrese su nombre:");
        String nombre = lectura.next();

        System.out.println("Hola "+nombre+"su numero de telefono es"+numero);

    }
}