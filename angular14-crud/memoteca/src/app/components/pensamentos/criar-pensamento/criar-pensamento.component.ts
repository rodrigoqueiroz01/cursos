import {Component, OnInit} from '@angular/core';
import {PensamentoService} from "../pensamento.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {lowercaseValidator} from "../pensamento/lowercaseValidator";

@Component({
  selector: 'app-criar-pensamento',
  templateUrl: './criar-pensamento.component.html',
  styleUrls: ['./criar-pensamento.component.css']
})
export class CriarPensamentoComponent implements OnInit {

  formulario!: FormGroup;

  constructor(
    private service: PensamentoService,
    private router: Router,
    private formBuilder: FormBuilder
  ) {}

  ngOnInit(): void {
    this.formulario = this.formBuilder.group({
      conteudo: ['', Validators.compose([
        Validators.required,
        Validators.pattern(/(.|\s)*\S(.|\s)*/)
      ])],
      autoria: ['', Validators.compose([
        Validators.required,
        Validators.minLength(3),
        lowercaseValidator
      ])],
      modelo: ['modelo1']
    });
  }

  public criarPensamento(): void {
    console.log(this.formulario.get('autoria')?.errors);
    if (this.formulario.valid) {
      this.service.save(this.formulario.value).subscribe(() => this.router.navigate(['/listarPensamento']));
      alert('Pensamento criado com sucesso!');
    }
  }

  public habilitarBotao(): string {
    if (this.formulario.valid) {
      return 'botao';
    } else {
      return 'botao__desabilitado'
    }
  }

  public cancelar(): void {
    this.router.navigate(['/listarPensamento']);
    alert('Operação cancelada!');
  }

}
