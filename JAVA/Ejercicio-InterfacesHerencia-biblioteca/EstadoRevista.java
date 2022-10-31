public class EstadoRevista implements PrestaRevista{
    boolean a;
    double num;
    public EstadoRevista() {

    }
    @Override
    public boolean prestarRevista() {
        this.a=true;
        return a;
    }
    @Override
    public boolean devolverRevista() {
        this.a=false;
        return a;
    }
    @Override
    public void numeroRevista(double numero) {
        this.num=numero;
    }
    @Override
    public boolean estadoRevista() {
        return a;
    }

    
    
}