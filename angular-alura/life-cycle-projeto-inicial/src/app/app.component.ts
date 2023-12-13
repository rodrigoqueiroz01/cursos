import {Component, DoCheck, OnInit} from '@angular/core';
import {Item} from "./interfaces/iItem";
import {ListaDeCompraService} from "./service/lista-de-compra.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, DoCheck {
  title = 'app-lista-de-compras';
  listaDeCompra!: Array<Item>;
  itemParaEdicao!: Item;

  constructor(
    private listaService: ListaDeCompraService
  ) {}

  ngOnInit() {
    this.listaDeCompra = this.listaService.getListaDeCompra();
  }

  ngDoCheck() {
    this.listaService.updateLocalStorage();
  }

  editarItem(item: Item) {
    this.itemParaEdicao = item;
  }

  deletarItem(id: number) {
    const index = this.listaDeCompra.findIndex((item) => item.id === id);
    this.listaDeCompra.splice(index, 1);
  }

  limparLista() {
    this.listaDeCompra = [];
  }

}
