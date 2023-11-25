import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Pensamento} from "./pensamento";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PensamentoService {

  private readonly API = 'http://localhost:3000/pensamentos';

  constructor(private http: HttpClient) {}

  public save(pensamento: Pensamento): Observable<Pensamento> {
    return this.http.post<Pensamento>(this.API, pensamento);
  }

  public findAll(page: number, filtro: string, favorites: boolean): Observable<Pensamento[]> {
    const itemsByPage = 6;

    let params = new HttpParams()
      .set("_page", page)
      .set("_limit", itemsByPage);

    if (filtro.trim().length > 2) params = params.set('q', filtro);
    if (favorites) params = params.set("favorito", true);

    return this.http.get<Pensamento[]>(this.API, { params });
  }

  public findById(id: number): Observable<Pensamento> {
    const url = `${this.API}/${id}`;
    return this.http.get<Pensamento>(url);
  }

  public update(pensamento: Pensamento): Observable<Pensamento> {
    const url = `${this.API}/${pensamento.id}`;
    return this.http.put<Pensamento>(url, pensamento);
  }

  public delete(id: number): Observable<Pensamento> {
    const url = `${this.API}/${id}`;
    return this.http.delete<Pensamento>(url);
  }

  public changeFavorite(pensamento: Pensamento): Observable<Pensamento> {
    pensamento.favorito = !pensamento.favorito;
    return this.update(pensamento);
  }

}
