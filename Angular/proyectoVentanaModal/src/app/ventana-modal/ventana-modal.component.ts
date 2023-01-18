import { Component, ElementRef, ViewChild } from '@angular/core';

@Component({
  selector: 'app-ventana-modal',
  templateUrl: './ventana-modal.component.html',
  styleUrls: ['./ventana-modal.component.css']
})
export class VentanaModalComponent {
  mostrar:boolean | undefined;
  @ViewChild('modalBack',null) modalBack:ElementRef;
  


}
