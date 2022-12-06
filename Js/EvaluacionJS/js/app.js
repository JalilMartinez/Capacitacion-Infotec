class AdministradorArticulos{
    codigo = 0;
    descripcion = '';
    precio = 0;

   obtenerCodigo(){
    let inputValue = document.getElementById("codigo").value; 
    this.codigo=inputValue;
   }
   obtenerDescripcion(){
    let inputValue = document.getElementById("descripcion").value; 
    this.descripcion=inputValue;
   }
   obtenerPrecio(){
    let inputValue = document.getElementById("precio").value; 
    this.precio=inputValue;
   }



}

const obtenerValor = () =>{
    let obtener = new AdministradorArticulos();
    obtener.obtenerCodigo();
    obtener.obtenerDescripcion();
    obtener.obtenerPrecio();
    document.write(obtener.codigo+'<br>');
    document.write(obtener.descripcion+'<br>');
    document.write(obtener.precio);
}