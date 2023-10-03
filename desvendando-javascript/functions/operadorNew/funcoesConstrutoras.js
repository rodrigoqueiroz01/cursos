var Pessoa = function (nome, idade) {
    this.nome = nome;
    this.idade = idade;
};

console.log(new Pessoa("Rodrigo", 24));
console.log(new Pessoa("Maria", 30));

var pedro = {};
Pessoa.call(pedro, "Pedro", 19);
console.log(pedro);

var ricardo = {};
Pessoa.call(ricardo, "Ricardo", 40);
console.log(ricardo);