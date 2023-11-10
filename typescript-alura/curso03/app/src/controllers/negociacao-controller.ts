import {Negociacao} from "../models/negociacao.js";
import {Negociacoes} from "../models/negociacoes.js";
import {NegociacoesView} from "../views/negociacoes-view.js";
import {MensagemView} from "../views/mensagem-view.js";
import {DiasDaSemana} from "../enums/dias-da-semana.js";
import {logarTempoExecucao} from "../decorators/logar-tempo-execucao.js";
import {inspect} from "../decorators/inspect.js";
import {domInject} from "../decorators/dom-inject.js";

export class NegociacaoController {

    @domInject('#data')
    private inputData: HTMLInputElement;

    @domInject('#quantidade')
    private inputQuantidade: HTMLInputElement;

    @domInject('#valor')
    private inputValor: HTMLInputElement;

    private negociacoes: Negociacoes = new Negociacoes();
    private negociacoesView: NegociacoesView = new NegociacoesView('#negociacoesView');
    private mensagemView: MensagemView = new MensagemView('#mensagemView');

    constructor() {
        this.negociacoesView.update(this.negociacoes);
    }

    @inspect()
    @logarTempoExecucao()
    public adiciona(): void {
        const negociacao = Negociacao.criaDe(
            this.inputData.value,
            this.inputQuantidade.value,
            this.inputValor.value
        );

        if (!this.ehDiaUtil(negociacao.data)) {
            this.mensagemView.update('Apenas negociações em dias úteis são aceitas.');
            return;
        }

        this.negociacoes.adiciona(negociacao);
        this.limparFormulario();
        this.atualizaView();
    }

    importaDados(): void {
        alert('oi')
    }

    private ehDiaUtil(date: Date) {
        return date.getDay() > DiasDaSemana.DOMINGO && date.getDay() < DiasDaSemana.SABADO;
    }

    private limparFormulario(): void {
        this.inputData.value = '';
        this.inputQuantidade.value = '';
        this.inputValor.value = '';
        this.inputData.focus();
    }

    private atualizaView(): void {
        this.negociacoesView.update(this.negociacoes);
        this.mensagemView.update('Negociação adcicionada com sucesso.')
    }

}