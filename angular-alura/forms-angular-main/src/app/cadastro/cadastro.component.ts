import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void { }

  public cadastrar(form: NgForm): void {
    form.valid ? this.router.navigate(['./sucesso']) : alert('Formulário inválido!')
  }

}
