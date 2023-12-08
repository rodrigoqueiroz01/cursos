import {Component, Input, OnChanges, OnInit, SimpleChanges} from '@angular/core';
import { faPen, faTrash } from '@fortawesome/free-solid-svg-icons';
import {Item} from "../../interfaces/iItem";

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit, OnChanges {

  @Input() item!: Item;
  faPen = faPen;
  faTrash = faTrash

  constructor() { }

  ngOnChanges() {
    console.log('OnChanges')
  }

  ngOnInit(): void {
    console.log('OnInit')
  }

}
