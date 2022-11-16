import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompruebaNumeros {
    private List<String> numeros = new ArrayList<String>();
    private List<String> numerosPrimos = new ArrayList<String>();
    
    public void pideNumeros(){
        int contador = 0;
        Scanner a = new Scanner(System.in);
        while(numeros.size() == 0){
            imprimeMensaje("Dame un numero");
            setNumeros(a.next());
        }
        while(Integer.parseInt(getNumeros(contador)) != (-1) ){
            imprimeMensaje("Dame un numero");
            setNumeros(a.next());
            contador ++;
        }
    }
   
    
  

    

    public int numeroMayor(){
        int a = Integer.parseInt(getNumeros(0));
        for (int i = 1; i < this.numeros.size()-1; i++) {
            if (a<Integer.parseInt(getNumeros(i))) {
                a = Integer.parseInt(getNumeros(i));
            }
        }
        return a;
    }
    public int numeroMenor(){
        int a = Integer.parseInt(getNumeros(0));
        for (int i = 1; i < this.numeros.size()-1; i++) {
            if (a>Integer.parseInt(getNumeros(i))) {
                a = Integer.parseInt(getNumeros(i));
            }
        }
        return a;
    }
    public int sumaNumeros(){
        int a = 0;
        for (int i = 0; i < this.numeros.size()-1; i++) {
            a+=Integer.parseInt(getNumeros(i));
        }
        return a;
    }
    public int sumaNumerosPositivos(){
        int a = 0;
        for (int i = 0; i < this.numeros.size()-1; i++)
            if(Integer.parseInt(getNumeros(i))>0)
                a+=Integer.parseInt(getNumeros(i));
        
        return a;
    }
    public int sumaNumerosNegativos(){
        int a = 0;
        for (int i = 0; i < this.numeros.size()-1; i++)
            if(Integer.parseInt(getNumeros(i))<0)
                a+=Integer.parseInt(getNumeros(i));
        
        return a;
    }
    
    public int[] obtenNumerosPrimos(){
        
        
        int a[] = new int[this.numeros.size()-1];
        
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(getNumeros(i));
        }
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int contador = -2;
            boolean primo=true;
            while ((primo) && (contador!=(-a[i]))){
                if ((-a[i]) % contador == 0)
                    primo = false;
                contador--;
                }
            setNumeros(String.valueOf(a[i]));
        }
        int b[]=new int[numerosPrimos.size()];
        for (int i = 0; i < this.numerosPrimos.size(); i++) {
            b[i]=Integer.parseInt(getNumerosPrimos(i));
        }
        

        return b;

    }
    

    public void imprimeMensaje(String a){
        System.out.println(a);
    }

    public String getNumeros(int a) {
        return numeros.get(a);
    }

    public void setNumeros(String a) {
        this.numeros.add(a);
    }
    public String getNumerosPrimos(int a) {
        return numerosPrimos.get(a);
    }
    public void setNumerosPrimos(String a) {
        this.numerosPrimos.add(a);
    }

    public static void main(String[] args) {
        CompruebaNumeros numeros = new CompruebaNumeros();

        numeros.pideNumeros();
        System.out.println("El numero mayor es : "+ numeros.numeroMayor() );
        System.out.println("El numero menor es" + numeros.numeroMenor());
        System.out.println("La suma total de los numeros dados es : "+numeros.sumaNumeros());
        
        int a[]=numeros.obtenNumerosPrimos();
        numeros.imprimeMensaje("Los numeros negativos primos son");
        for (int i = 0; i < a.length; i++) {
            numeros.imprimeMensaje(String.valueOf(a[i]));
        }
        
    }




}
