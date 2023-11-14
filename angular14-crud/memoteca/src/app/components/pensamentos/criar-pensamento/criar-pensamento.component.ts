import { Component, OnInit } from '@angular/core';
import {Pensamento} from "../pensamento";

@Component({
  selector: 'app-criar-pensamento',
  templateUrl: './criar-pensamento.component.html',
  styleUrls: ['./criar-pensamento.component.css']
})
export class CriarPensamentoComponent implements OnInit {

  public pensamento: Pensamento = {
    id: 1,
    conteudo: '',
    autoria: '',
    modelo: ''
  }

  constructor() { }

  ngOnInit(): void {
  }

  public criarPensamento(): void {
    alert('Pensamento criado com sucesso!')
  }

  public cancelar(): void {
    alert('Operação cancelada!')
  }

}
