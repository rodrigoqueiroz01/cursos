import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import {ListaDeCompraService} from "../../service/lista-de-compra.service";
import {Item} from "../../interfaces/iItem";

@Component({
  selector: 'app-input',
  templateUrl: './input.component.html',
  styleUrls: ['./input.component.css']
})
export class InputComponent implements OnInit, OnChanges {
  @Input() itemParaSerEditado!: Item;
  valorItem!: string;
  editando: boolean = false;
  textoBtn: string = 'Salvar item'

  constructor(
    private service: ListaDeCompraService
  ) { }

  ngOnChanges(changes: SimpleChanges) {
    if (changes['itemParaSerEditado'].currentValue) {
      this.editando = true;
      this.textoBtn = 'Editar item';
      this.valorItem = this.itemParaSerEditado?.nome;
    }
  }

  ngOnInit(): void { }

  adicionarItem(): void {
    this.service.save(this.valorItem);
    this.limparCampo();
  }

  editarItem() {
    this.service.update(this.itemParaSerEditado, this.valorItem);
    this.limparCampo();
    this.editando = false;
    this.textoBtn = 'Salvar item'
  }

  limparCampo(): void {
    this.valorItem = '';
  }

}
