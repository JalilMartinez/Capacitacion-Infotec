public class Circulo extends Figura{
    public Circulo(int ancho, int alto) {
        super(ancho, alto);
        
    }

    @Override
    public float calculaArea() {
        this.setArea(3.1416*((this.getAncho()/2)*(this.getAlto()/2)));
        return this.getArea();
    }
    
}
