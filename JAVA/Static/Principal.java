public abstract class Principal {
    private int v1;
    private double v2;
    private float v3;
    private boolean v4;
    private char a;

    public Principal(int v1, double v2, float v3, boolean v4, char a){
        super();
        this.v1=v1;
        this.v3=v3;
        this.v4=v4;
        this.v2=v2;
        this.a=a;


    };


    public static void main(String[] args) {
        
        Principal m1 = new Clase1(1, 2, 3, false, 'a');
        Principal m2 = new Clase2(0, 0, 0, false, 'a');

    }

}
