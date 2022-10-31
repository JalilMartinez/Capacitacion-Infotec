public class Libros extends Biblioteca{
    
    PrestaLibro estado = new PrestaLibro(){
        boolean prestado;
        @Override
        public boolean prestarLibro() {
            this.prestado = true;
            return this.prestado;
        }

        @Override
        public boolean devolverLibro() {
            this.prestado=false;
            return prestado;
        }

        @Override
        public boolean estadopLibro() {
            return prestado;
        }

    };

    public Libros(String titulo, String estado, double codigo, double año) {
        super(titulo, estado, codigo, año);
        //TODO Auto-generated constructor stub
    }
   
    public String estadoLibro(){
        
        if(estado.estadopLibro()==false){
            return "Disponible";
        }else{
            return "Prestado";
        }
    }
    
    @Override
    public String toString(){
        return ("Nombre Libro : "+this.getTitulo()+"\n Es del año : " + this.getAño()
                +"\n Codigo : "+ this.getCodigo()+ "\n Su estado es : "+ this.getEstado());
    }

}
