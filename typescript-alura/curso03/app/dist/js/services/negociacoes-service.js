import { Negociacao } from "../models/negociacao.js";
export class NegociacoesService {
    obterNegociacoesDoDia() {
        return fetch('http://localhost:8080/dados')
            .then(response => response.json())
            .then((dados) => {
            return dados.map(dadosDeHoje => new Negociacao(new Date(), dadosDeHoje.vezes, dadosDeHoje.montante));
        });
    }
}
//# sourceMappingURL=negociacoes-service.js.map