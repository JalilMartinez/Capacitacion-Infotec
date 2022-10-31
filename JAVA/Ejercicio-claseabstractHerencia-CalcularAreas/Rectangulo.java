public class Rectangulo extends Figura {
   
    public Rectangulo(int ancho, int alto) {
        super(ancho, alto);
       
    }

    @Override
    public float calculaArea() {
        this.setArea(this.getAncho()*this.getAlto());
        return this.getArea();
    }
    
}
