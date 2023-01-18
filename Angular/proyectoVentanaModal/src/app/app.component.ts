import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  modal = false;
  constructor(){

  }

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  openModal(){
    this.modal=true;

  }
  title = 'proyectoVentanaModal';
}
