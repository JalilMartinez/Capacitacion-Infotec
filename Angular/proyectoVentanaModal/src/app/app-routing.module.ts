import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VentanaModalComponent } from './ventana-modal/ventana-modal.component';

const routes: Routes = [
  {
    path:'ventana-modal',
    component:VentanaModalComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }




