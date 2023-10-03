// Não existe

var pessoa = {};

pessoa.idade
pessoa.nome = "Rodrigo"
pessoa.idade = 30

for (var propriedade in pessoa) {
    console.log(propriedade)
}

console.log(pessoa)