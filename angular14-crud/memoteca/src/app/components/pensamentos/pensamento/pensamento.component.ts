import {Component, Input, OnInit} from '@angular/core';
import {Pensamento} from "../pensamento";
import {PensamentoService} from "../pensamento.service";

@Component({
  selector: 'app-pensamento',
  templateUrl: './pensamento.component.html',
  styleUrls: ['./pensamento.component.css']
})
export class PensamentoComponent implements OnInit {

  @Input() pensamento: Pensamento = {
    id: 0,
    conteudo: '',
    autoria: '',
    modelo: '',
    favorito: false
  }

  constructor(private service: PensamentoService) { }

  ngOnInit(): void { }

  public larguraPensamento(): string {
    return this.pensamento.conteudo.length >= 250 ? 'pensamento-g' : 'pensamento-p';
  }

  public mudarIconeFavorito(): string {
    return !this.pensamento.favorito ? 'inativo' : 'ativo';
  }

  public atualizarFavoritos() {
    this.service.changeFavorite(this.pensamento).subscribe();
  }

}
