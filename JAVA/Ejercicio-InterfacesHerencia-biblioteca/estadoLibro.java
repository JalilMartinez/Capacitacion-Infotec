public class estadoLibro implements PrestaLibro{
    boolean a;
    public estadoLibro() {

    }

    @Override
    public boolean prestarLibro(){
        this.a = true;
        return this.a;
    }

    @Override
    public boolean devolverLibro() {
        this.a=false;
        return a;
    }

    @Override
    public boolean estadopLibro() {
        
        return this.a;
    }
    
}
