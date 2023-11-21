import {Component, OnInit} from '@angular/core';
import {Pensamento} from "../pensamento";
import {PensamentoService} from "../pensamento.service";

@Component({
  selector: 'app-listar-pensamento',
  templateUrl: './listar-pensamento.component.html',
  styleUrls: ['./listar-pensamento.component.css']
})
export class ListarPensamentoComponent implements OnInit {

  public listaPensamentos: Pensamento[] = [];
  public paginaAtual: number = 1;
  public haMaisPensamentos: boolean = true;

  constructor(private service: PensamentoService) { }

  ngOnInit(): void {
    this.service.findAll(this.paginaAtual).subscribe((listaPensamentos) => this.listaPensamentos = listaPensamentos);
  }

  public carregarMaisPensamentos() {
    this.service.findAll(++this.paginaAtual).subscribe(listaPensamentos => {
      this.listaPensamentos.push(...listaPensamentos);
      if (!listaPensamentos.length) this.haMaisPensamentos = false;
    })
  }

}
