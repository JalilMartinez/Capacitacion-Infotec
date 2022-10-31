public class Revistas extends Biblioteca{
    int numero;
    public Revistas(String titulo, String estado, double codigo, double año) {
        super(titulo, estado, codigo, año);
        this.numero=numero;
        //TODO Auto-generated constructor stub
    }
    
    PrestaRevista estadoRevista = new PrestaRevista() {
        boolean a;
        double num;
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
        
    };
    public String estadoRevista(){
        
        if(estadoRevista.estadoRevista()==false){
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
