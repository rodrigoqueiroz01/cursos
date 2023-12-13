import {Component, EventEmitter, Input, OnChanges, OnDestroy, OnInit, Output, SimpleChanges} from '@angular/core';
import {faPen, faTrash} from '@fortawesome/free-solid-svg-icons';
import {Item} from "../../interfaces/iItem";

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit, OnChanges, OnDestroy {

  @Input() item!: Item;
  @Output() emitindoItemParaEdicao = new EventEmitter();
  @Output() emitindoIdParaDeletar = new EventEmitter();
  faPen = faPen;
  faTrash = faTrash

  constructor() {
  }

  ngOnChanges() {
  }

  ngOnInit(): void {
  }

  ngOnDestroy() {
    console.log('Deletado com sucesso !!!')
  }

  editarItem() {
    this.emitindoItemParaEdicao.emit(this.item);
  }

  deletarItem() {
    console.log('Deletando ...')
    this.emitindoIdParaDeletar.emit(this.item.id);
  }

  checarItem() {
    this.item.comprado ? this.item.comprado = false : this.item.comprado = true;
  }

}
