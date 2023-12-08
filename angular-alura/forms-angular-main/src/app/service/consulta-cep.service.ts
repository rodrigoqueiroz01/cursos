import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ConsultaCepService {

  private urlAPI: string = 'https://viacep.com.br/ws/'

  constructor(
      private http: HttpClient
  ) {}

  public getConsultaCep(cep: string): Observable<Object> {
    return this.http.get(`${this.urlAPI}${cep}/json`);
  }

}
