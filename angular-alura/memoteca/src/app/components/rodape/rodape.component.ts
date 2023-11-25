import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-rodape',
  templateUrl: './rodape.component.html',
  styleUrls: ['./rodape.component.css']
})
export class RodapeComponent implements OnInit {

  public anoAtual: number;

  constructor() {
    this.anoAtual = new Date().getFullYear();
  }

  ngOnInit(): void {
  }

}
