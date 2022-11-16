import java.util.Scanner;

public class Horario {
    private int hora;


    public Horario(){
        this.hora=0;
    }

    public void pideHora(){
        Scanner al = new Scanner(System.in);
        System.out.println("Dame la hora : ");
        int hora= al.nextInt();
        setHora(hora);
    }

    public void compara(){
        if(6<= getHora() && getHora() <= 12){
            imprimeMensaje("Buenos Días");
        } else if(13<= getHora() && getHora() <= 20){
            imprimeMensaje("Buenas Tardes");
        } else {
            imprimeMensaje("Buenas Noches");
        }

    }
    public void imprimeMensaje(String a){
        System.out.println(a);
    }

    private void setHora(int i){
        this.hora=i;
    }
    private int getHora(){
        return this.hora;
    }


    public static void main(String[] args) {
        Horario hora = new Horario();
        hora.pideHora();
        hora.compara();


    }
}
