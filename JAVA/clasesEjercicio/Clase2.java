public class Clase2 extends Clase1{
    static int v1;
    static double v2;
    static char a;

    public Clase2(int v1, double v2, float v3, boolean v4, char a) {
        super(v1, v2, v3, v4, a);
        
    }

    static Clase1 metodo1(Clase1 varC1){
        varC1=null;
        return varC1;
    }

    static String medoto2(String a, String b){
        return a+'-'+b;
    }


    public static void main(String[] args) {
        Clase1 m1 = new Clase1(1, 2, 3, false, 'a');
        Clase1 m11 = new Clase2(1, 2, 3, false, 'a');

        Clase2 m2 = new Clase2(1, 2, 3, false, 'a');
       

        /*se verifica hashcode*/
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        if(m1.hashCode()==m11.hashCode()){
            System.out.println("son el mismo");
        }else{
            System.out.println("Son diferentes");
        }

        /*accedemos a los medotos de la clase 2*/
        System.out.println(m2.medoto2("hola", "mundo"));

        /*Realiza un procedimiento que compare cada uno de los atributos de la CLASE1 con otro Objeto del mismo tipo, de la forma y en donde creas que sea más limpio y reutilizable.*/
        if(m1.equals(m11)){
            System.out.println("son el mismo");
        }else{
            System.out.println("Son diferentes");
        }
    }
    
    
}

