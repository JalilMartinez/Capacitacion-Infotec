public class Main {
    public static void main(String[] args) {
        //Implicitas
        System.out.println("Conversiones Implicitas");
        int varableI = 800;
        long variableL = varableI;
        float variablef = variableL;

        byte variableb = 50;
        byte variableb2 = 100;
        long s = variableb+variableb2+variableL;

        System.out.println(variableL);
        System.out.println(variablef);
        System.out.println(s);

        System.out.println("Conversiones Explicitas");
        char variablechar = 'h';
        int variableI = variablechar;
        variablechar = (char) variableI;

        double varD = 425.955;
        long variableLo =(long)varD;

        int suma = (int) (variableb+variableb2+variableLo);

        System.out.println(variablechar);
        System.out.println(variableLo);
        System.out.println(suma);
    }
}