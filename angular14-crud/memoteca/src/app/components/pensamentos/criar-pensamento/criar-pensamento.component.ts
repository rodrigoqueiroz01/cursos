import { Component, OnInit } from '@angular/core';
import {Pensamento} from "../pensamento";
import {PensamentoService} from "../pensamento.service";
import {Router} from "@angular/router";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-criar-pensamento',
  templateUrl: './criar-pensamento.component.html',
  styleUrls: ['./criar-pensamento.component.css']
})
export class CriarPensamentoComponent implements OnInit {

  public pensamento: Pensamento = {
    conteudo: '',
    autoria: '',
    modelo: ''
  }

  constructor(
    private service: PensamentoService,
    private router: Router,
  ) { }

  ngOnInit(): void { }

  public criarPensamento(): void {
    this.service.save(this.pensamento).subscribe(() => this.router.navigate(['/listarPensamento']));
    alert('Pensamento criado com sucesso!');
  }

  public cancelar(): void {
    this.router.navigate(['/listarPensamento']);
    alert('Operação cancelada!');
  }

}
