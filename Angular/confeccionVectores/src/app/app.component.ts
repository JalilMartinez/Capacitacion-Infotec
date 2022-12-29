import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  

  art={
    codigo:0,
    descripcion:"",
    precio:0
  }

  articulos=[
  {codigo:1, descripcion:'papas', precio:10.55},
  {codigo:2, descripcion:'jugo', precio:15.55},
  {codigo:3, descripcion:'paleta', precio:20.55},
  {codigo:4, descripcion:'refresco', precio:30.55},
  {codigo:5, descripcion:'cereal', precio:40.55}
  ];

  nohayRegistros(){
    return this.articulos.length>0;
  }

  borrar(codigo:number){
    for(let x=0;x<this.articulos.length;x++)
      if (this.articulos[x].codigo==codigo) {
        this.articulos.splice(x,1);
        return;
      }
  }

  agregar(){
    if(this.art.codigo==0){
      alert('Debe de ingresar un código de articulo distinto a cero');
      return;
    }
    for(let x=0;x<this.articulos.length;x++){
      if(this.articulos[x].codigo==this.art.codigo){
        alert('Ya existe un articulo con dicho codigo')
        return;
      }
    }
    this.articulos.push({codigo:this.art.codigo,
                        descripcion:this.art.descripcion,
                        precio:this.art.precio});
    
    this.art.codigo=0;
    this.art.descripcion="";
    this.art.precio=0;
  }

  seleccionar(art:{codigo:number;descripcion:string;precio:number}){
    this.art.codigo=art.codigo;
    this.art.descripcion=art.descripcion;
    this.art.precio=art.precio;
  }

  modificar(){
    for (let x = 0; x < this.articulos.length; x++) {
      if(this.articulos[x].codigo==this.art.codigo){
        this.articulos[x].descripcion=this.art.descripcion;
        this.articulos[x].precio=this.art.precio;
        return;
      }
    }
    alert('No existe el codigo de articulo ingresado')
  }

}
