import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../../_service/persona.service';
import { Observable } from 'rxjs';
import { Persona } from '../../_model/persona';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-formulario-persona',
  templateUrl: './formulario-persona.component.html',
  styleUrls: ['./formulario-persona.component.css'],
})
export class FormularioPersonaComponent implements OnInit {
  // personaLista: Persona[] = [];

  formulario: FormGroup;
  id: number;
  editar: boolean;

  constructor(
    private personaService: PersonaService,
    private activeRoute: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.formulario = new FormGroup({
      id: new FormControl(0),
      nombre: new FormControl(''),
      apellido: new FormControl(''),
    });

    this.activeRoute.params.subscribe((dato: Params) => {
      this.id = dato.id;
      this.editar = this.id != null;
    });

    this.cargarFormulario();
  }

  cargarFormulario() {
    if (this.editar) {
      this.personaService.obtenerPorId(this.id).subscribe((datos) => {
        this.formulario = new FormGroup({
          id: new FormControl(datos.id),
          nombre: new FormControl(datos.nombre),
          apellido: new FormControl(datos.apellido),
        });
      });
    }
  }

  private persona(): Persona {
    const persona: Persona = new Persona();

    persona.id = this.formulario.value.id;
    persona.nombre = this.formulario.value.nombre;
    persona.apellido = this.formulario.value.apellido;

    return persona;
  }

  guardar() {
    this.personaService
      .guardarPersona(this.persona())
      .subscribe(() => console.log('Se guardó correctamente'));
  }


  modificar() {
    this.personaService
      .modificarPersona(this.persona())
      .subscribe(() => console.log('Se modicó correctamente'));
  }


  operar(){

   if (this.editar) {
     this.modificar();
   } else {
     this.guardar();
   }

  }

  
}
