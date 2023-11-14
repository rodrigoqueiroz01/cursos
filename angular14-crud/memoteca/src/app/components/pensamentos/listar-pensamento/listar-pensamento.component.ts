import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listar-pensamento',
  templateUrl: './listar-pensamento.component.html',
  styleUrls: ['./listar-pensamento.component.css']
})
export class ListarPensamentoComponent implements OnInit {

  listaPensamentos = [
    {
      conteudo: 'Comunicação entre componentes',
      autoria: 'Angular',
      modelo: 'modelo3'
    },
    {
      conteudo: 'Passo informações para o componente filho',
      autoria: 'Componente pai',
      modelo: 'modelo2'
    },
    {
      conteudo: 'Minha propriedade é decorada com o componente @Input()',
      autoria: 'Componente filho',
      modelo: 'modelo1'
    },
    {
      conteudo: 'Pode-se compreender o texto verbal, oral e escrito, como uma prática social que utiliza estruturas verbais, organizadas e caracterizadas por suas estruturas linguísticas e sua função social, com vistas a cumprir um papel pessoal ou coletivo na vida humana. O mesmo se aplica aos textos não verbais, também compreendidos como uma ação social, diferenciando-se somente em função das estruturas e códigos utilizados.',
      autoria: 'Anônimo',
      modelo: 'modelo2'
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
