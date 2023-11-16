import { Component, OnInit } from '@angular/core';
import {Pensamento} from "../pensamento";
import {PensamentoService} from "../pensamento.service";
import {Observable} from "rxjs";

@Component({
  selector: 'app-listar-pensamento',
  templateUrl: './listar-pensamento.component.html',
  styleUrls: ['./listar-pensamento.component.css']
})
export class ListarPensamentoComponent implements OnInit {

  public listaPensamentos: Pensamento[] = [];

  constructor(private service: PensamentoService) { }

  ngOnInit(): void {
    this.service.listar().subscribe((listaPensamentos) => this.listaPensamentos = listaPensamentos);
  }

}
