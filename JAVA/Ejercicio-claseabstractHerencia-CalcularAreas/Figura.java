public abstract class Figura {
    private int cordenadaY, cordenadaX;
    private int ancho;
    private int alto;
    private float perimetro, area;

    public Figura(int ancho, int alto){
        super();
        this.ancho=ancho;
        this.alto=alto;
    }
    
    public int getAncho(){
        return this.ancho;
    }
    public int getAlto(){
        return this.alto;
    }
    public float getArea(){
        return this.area;
    }
    public void setArea(double a){
        this.area=(float) a;
    }
    

    public abstract float calculaArea();

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4, 5);
        Rectangulo rectangulo = new Rectangulo(3,6);
        Circulo circulo = new Circulo(5,5);

        System.out.println("Area de triangulo es :" + triangulo.calculaArea());
        System.out.println("Area de rectangulo es :" +rectangulo.calculaArea());
        System.out.println("Area de circulo es :" +circulo.calculaArea());


    }
}