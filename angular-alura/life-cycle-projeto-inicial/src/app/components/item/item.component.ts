import {Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges} from '@angular/core';
import { faPen, faTrash } from '@fortawesome/free-solid-svg-icons';
import {Item} from "../../interfaces/iItem";

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit, OnChanges {

  @Input() item!: Item;
  @Output() emitindoItemParaEdicao = new EventEmitter();
  faPen = faPen;
  faTrash = faTrash

  constructor() { }

  ngOnChanges() {}

  ngOnInit(): void {}

  editarItem() {
    this.emitindoItemParaEdicao.emit(this.item);
  }

}
