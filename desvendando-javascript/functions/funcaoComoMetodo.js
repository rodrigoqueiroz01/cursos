var getIdade = function () {
    return this.idade;
}

var pessoa = {
    nome: "Rodrigo",
    idade: 24,
    getIdade: getIdade
};

console.log(getIdade());
console.log(pessoa.getIdade());