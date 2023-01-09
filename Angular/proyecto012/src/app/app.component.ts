import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'proyecto012';
  nombre = 'Jalil Martinez';
  saldo = 100.50;
  dias=['domingo','lunes','martes','miercoles','jueves','viernes','sabado'];
  articulos=[
    {
      codigo:1,
      descripcion:"papas",
      precio:12.33},
    {
      codigo:2,
      descripcion:"chocolate",
      precio:5.50
    }
  ];
  fechaActual=new Date();
}
