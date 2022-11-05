import java.lang.reflect.Array;

public class MetodosListas{
    public String concatena(String a, String b, Integer c, Integer d){
        return a+' '+b+' '+c+' '+d;
    }

    public String concatena2(String a,double b, double c){
        return a +' '+ b +' '+c;
    }

    public int  suma(int x){
        int a = x+x;
        return a;
    }

    public int  suma(double x){
        int a = (int) (x+x);
        return 0;
    }

    public int  suma(float x){
        int a = (int) (x+x);
        return 0;
    }

    public int[] modificaArray(int[] numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==68){
                numeros[i]=90;
            }else if(numeros[i]==920){
                numeros[i]=25;
            }
        }
        return numeros;
    }

    public void imprimeLista(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion "+i+" = "+numeros[i]);
        }

    }
    public void imprimeLista(String[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion "+i+" = "+numeros[i]);
        }

    }

    
    public int suma (String[] a){
        int su=0;
        for (int i = 0; i < a.length; i++) {
            su+=Integer.parseInt(a[i]);
        }
        return su;
    }

    public static void main(String[] args) {
        
        MetodosListas m1 = new MetodosListas();
        System.out.println("\n Ejercicio concatenacion \n");
        System.out.println(m1.concatena("Hola", "Pato", 41, 1242));

        System.out.println("\n Ejercicio concatenacion con resultado del ejercicio anterior \n");
        System.out.println(m1.concatena2(m1.concatena("Hola", "Pato", 41, 124442), 2554, 454));
       
        System.out.println("\n Ejercicio lista y cambio de numeros \n");
        // array 
        // 10
        // 58
        // 68 ->90
        // 920 ->25
        // 15
        // 16
        // 85
        // 75
        // 32
        // imprimir numeros con su posicion
        int numeros[] = {10,58,68,920,15,16,85,75,32};
        m1.imprimeLista(m1.modificaArray(numeros));
        
        System.out.println("\n Ejercicio lista de strings \n");
        //array strings
        // 15
        // 30
        // 12
        // 60
        //sumarlos y mostrar resultado con println()
        String numerosS[] = {"15","30","12","60"};
        m1.imprimeLista(numerosS);
        System.out.println("El total de la suma es : "+m1.suma(numerosS));





    }



}