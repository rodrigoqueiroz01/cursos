import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { NgForm } from "@angular/forms";
import { ConsultaCepService } from "../service/consulta-cep.service";
import { Subscription } from "rxjs";

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor(
      private router: Router,
      private consultaCepService: ConsultaCepService
  ) {}

  ngOnInit(): void { }

  public cadastrar(form: NgForm): void {
    form.valid ? this.router.navigate(['./sucesso']) : alert('Formulário inválido!');
  }

  public consultaCEP(event: any): Subscription {
    const cep = event.target.value;
    return this.consultaCepService.getConsultaCep(cep).subscribe(resultado => console.log(resultado));
  }

}
