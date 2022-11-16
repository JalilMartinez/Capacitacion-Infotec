import java.util.Scanner;

/**
 * Triangulo
 */
public class Triangulo {
    private int altura;
    public Triangulo (){
        setAltura(0);
    }

    public void pideAltura(){
        Scanner a = new Scanner(System.in);
        imprimeMensaje("Ingrese la altura : ");
        int al=a.nextInt();
        setAltura(al);
    }

    public void imprimeTrianguloCompleto(){
        String a = "";
        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getAltura()-i; j++) {
                a+="*";
            }
            imprimeMensaje(a);
            a="";
        }
    }

    public void imprimeTrianguloVacio(){
        String a = "";
        for (int i = 0; i < getAltura(); i++) {
            if(i==0 || i==getAltura()-1){
                for (int j = 0; j < getAltura()-i; j++) {
                    a+="*";
                }
            }else{
                for (int j = 0; j < getAltura()-i; j++) {
                    if(j==0||j==getAltura()-i-1){
                        a+="*";
                    }else{
                        a+=" ";
                    }
                }
            }
            imprimeMensaje(a);
            a="";
        }
    }

    public void imprimeMensaje(String a){
        System.out.println(a);
    }
    public int getAltura() {
        return altura;
    }
    private void setAltura(int altura) {
        this.altura = altura;
    }



    



    public static void main(String[] args) {
        Triangulo tr = new Triangulo();
        tr.pideAltura();
        tr.imprimeMensaje("Triangulo completo");
        tr.imprimeTrianguloCompleto();
        tr.imprimeMensaje("Triangulo vacio");
        tr.imprimeTrianguloVacio();

    }


    
}