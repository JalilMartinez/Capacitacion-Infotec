public class Main {
    public static void main(String[] args) {
        int a = 4, b=7;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        float divicion = 0;
        float modulo = 0;

        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        divicion = b/a;
        modulo = b%a;




        System.out.println(" El resultado de "+a+" + "+b+" = " +suma);
        System.out.println(" El resultado de "+a+" - "+b+" = " +resta);
        System.out.println(" El resultado de "+a+" * "+b+" = " +multiplicacion);
        System.out.println(" El resultado de "+b+" / "+a+" = " +divicion);
        System.out.println(" El resultado de "+a+" % "+b+" = " +modulo);

        suma ++;
        resta --;
        multiplicacion += suma;


        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);


    }
}