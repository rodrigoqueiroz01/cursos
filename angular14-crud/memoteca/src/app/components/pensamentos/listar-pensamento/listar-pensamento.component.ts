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
  public filtro: string = '';

  constructor(private service: PensamentoService) { }

  ngOnInit(): void {
    this.service.findAll(this.paginaAtual, this.filtro).subscribe((listaPensamentos) => {
      this.listaPensamentos = listaPensamentos
    });
  }

  public carregarMaisPensamentos(): void {
    this.service.findAll(++this.paginaAtual, this.filtro).subscribe(listaPensamentos => {
      this.listaPensamentos.push(...listaPensamentos);
      if (!listaPensamentos.length) this.haMaisPensamentos = false;
    })
  }

  public pesquisarPensamentos(): void {
    this.haMaisPensamentos = true;
    this.paginaAtual = 1;
    this.service.findAll(this.paginaAtual, this.filtro).subscribe(listaPensamentos => {
      this.listaPensamentos = listaPensamentos
    });
  }

}
