// É uma coleção dinâmica de chaves e valores de qualquer tipo de dado.
// É possível adicionar ou remover propriedades a qualquer momento.

// var pessoa = {}; // Objeto vazio

// Objeto literal
var pessoa = {
    nome: "João",
    idade: 24,
    telefone: null,
    endereco: {
        logradouro: "Av. Brasil",
        numero: 70,
        bairro: "Centro"
    }
};

pessoa.telefone = "9999-9999";

console.log(typeof pessoa);
console.log(pessoa.nome);
console.log(pessoa["nome"] = "João"); // Acessa a propriedade dinamicamente.
console.log(pessoa.endereco.bairro);
console.log(pessoa["endereco"]["bairro"] = "Centro");
console.log(pessoa.endereco["bairro"] = "Centro");
console.log(pessoa.telefone);
console.log(pessoa.peso = undefined);
console.log(pessoa["cor dos olhos"] = "Azul");

for (var propriedade in pessoa) {
    console.log("## " + propriedade + " " + pessoa[propriedade]);
}