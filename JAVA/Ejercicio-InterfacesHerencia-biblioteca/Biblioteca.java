public class Biblioteca{
    String titulo, estado;
    double codigo, año;

    public Biblioteca(String titulo, String estado, double codigo, double año){
        this.titulo =titulo;
        this.estado =estado;
        this.codigo=codigo;
        this.año=año;

    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getEstado(){
        return this.estado;
    }
    public double getCodigo(){
        return this.codigo;
    }
    public double getAño(){
        return this.año;
    }

    public static void main(String[] args) {
        Libros libro = new Libros("hola","nuevo",1515,2020);
        System.out.println(libro.toString()+"\n"+libro.estadoLibro());

        Revistas revista = new Revistas("hola","usado",1515,2020);
        System.out.println(revista.toString()+"\n"+revista.estadoRevista());
        
    }
}