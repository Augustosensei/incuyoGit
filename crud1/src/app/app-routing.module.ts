import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarPersonaComponent } from './pages/listar-persona/listar-persona.component';
import { FormularioPersonaComponent } from './pages/formulario-persona/formulario-persona.component';

const routes: Routes = [{path: 'listar', component: ListarPersonaComponent},
                        {path: 'guardar', component: FormularioPersonaComponent},
                        {path: 'editar/:id', component: FormularioPersonaComponent},
                        {path: '**', component: ListarPersonaComponent},
                        {path: '', redirectTo: 'listar', pathMatch: 'full'}
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
