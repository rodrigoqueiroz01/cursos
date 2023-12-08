import {Router} from '@angular/router';
import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {ConsultaCepService} from "../service/consulta-cep.service";

@Component({
    selector: 'app-cadastro',
    templateUrl: './cadastro.component.html',
    styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

    constructor(
        private router: Router,
        private consultaCepService: ConsultaCepService
    ) {
    }

    ngOnInit(): void {
    }

    public cadastrar(form: NgForm): void {
        form.valid ? this.router.navigate(['./sucesso']) : alert('Formulário inválido!');
    }

    public consultaCEP(event: any, formulario: NgForm) {
        const cep = event.target.value;

        if (cep != '') {
            this.consultaCepService.getConsultaCep(cep).subscribe(resultado => {
                console.log(resultado);
                this.populandoEndereco(resultado, formulario);
            });
        }
    }

    public populandoEndereco(dados: any, formulario: NgForm) {
        formulario.form.patchValue({
            endereco: dados.logradouro,
            complemento: dados.complemento,
            bairro: dados.bairro,
            cidade: dados.localidade,
            estado: dados.uf
        })
    }

}
