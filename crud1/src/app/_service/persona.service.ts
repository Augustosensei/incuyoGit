import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../_model/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  url = 'http://localhost:8080/persona';
  //url = 'https://django-proyecto-persona.herokuapp.com/api/persona/';
  constructor(private http: HttpClient) { }

   public listarPersona(): Observable<Persona[]>{
    return this.http.get<Persona[]>(this.url);
   }

   public obtenerPorId(id: number): Observable<Persona>{
     return this.http.get<Persona>(`${this.url}/${id}`);
   }

   public guardarPersona(persona: Persona): Observable<Persona>{
     return this.http.post<Persona>(this.url, persona);
   }

   public modificarPersona(persona: Persona): Observable<Persona>{
    return this.http.put<Persona>(this.url, persona);
  }


  public borrarPorId(id: number): Observable<void>{
    return this.http.delete<void>(`${this.url}/${id}`);
  }


}
