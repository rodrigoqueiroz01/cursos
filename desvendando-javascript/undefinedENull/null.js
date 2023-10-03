// Ausência do valor de uma determinada propriedade existente.

var pessoa = {};

pessoa.idade;
pessoa.nome = "Rodrigo";
pessoa.idade = null;

for (var propriedade in pessoa) {
    console.log(propriedade);
}

console.log(pessoa);