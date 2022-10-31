public class Triangulo extends Figura{

    public Triangulo(int ancho, int alto) {
        super(ancho, alto);
        
    }


    public float calculaArea() {


        this.setArea((this.getAncho()*this.getAlto())/2);
        return this.getArea();
    }
    


    
}
