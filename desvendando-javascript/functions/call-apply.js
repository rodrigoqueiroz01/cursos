var getIdade = function (extra) {
    return this.idade + extra;
}

var pessoa = {
    nome: "Rodrigo",
    idade: 24,
    getIdade: getIdade
};

console.log(getIdade.call(pessoa, 2));
console.log(getIdade.apply(pessoa, [2]));