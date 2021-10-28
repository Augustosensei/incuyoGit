import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../../_service/persona.service';
import { Persona } from '../../_model/persona';

@Component({
  selector: 'app-listar-persona',
  templateUrl: './listar-persona.component.html',
  styleUrls: ['./listar-persona.component.css']
})
export class ListarPersonaComponent implements OnInit {

   persona: Persona;
   listarPersona: Persona [] = [];
  constructor(private personaService: PersonaService) { }

  ngOnInit(): void {
    this.listar();
  }

  listar(): void {
    this.personaService.listarPersona().subscribe((data) => {
      this.listarPersona = data;
    });
  }

}
