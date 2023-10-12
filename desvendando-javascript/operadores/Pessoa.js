var Pessoa = function (nome, idade) {
    this.nome = nome;
    this.idade = idade;
}

var pedro = new Pessoa("Pedro", 20);

console.log(pedro instanceof Pessoa);
console.log(pedro instanceof Date);
console.log("nome" in pedro);

var isMaiorIdade = this.idade > 18 ? "Maior de idade" : "Menor de idade";
console.log(isMaiorIdade);