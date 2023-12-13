import {Item} from 'src/app/interfaces/iItem';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListaDeCompraService {

  private listaDeCompra: Item[];

  constructor() {
    this.listaDeCompra = JSON.parse(localStorage.getItem('itens') || '[]');
  }

  getListaDeCompra(): Item[] {
    return this.listaDeCompra;
  }

  criarItem(nomeItem: string) {
    const id = this.listaDeCompra.length + 1;

    const item: Item = {
      id: id,
      nome: nomeItem,
      data: new Date().toLocaleString('pt-BR'),
      comprado: false
    }

    return item;
  }

  save(nomeDoItem: string) {
    const item = this.criarItem(nomeDoItem);
    this.listaDeCompra.push(item);
    // this.updateLocalStorage();
  }

  update(itemAntigo: Item, nomeEditado: string) {
    const itemEditado: Item = {
      id: itemAntigo.id,
      nome: nomeEditado,
      data: itemAntigo.data,
      comprado: itemAntigo.comprado
    }

    const id = itemAntigo.id;
    this.listaDeCompra.splice(Number(id) - 1, 1, itemEditado);
    // this.updateLocalStorage();
  }

  updateLocalStorage() {
    localStorage.setItem('itens', JSON.stringify(this.listaDeCompra));
  }

}
