var homem = {
    sexo: "masculino"
}

var joao = {
    nome: "João",
    idade: 20,
    sexo: "feminino"
}
Object.setPrototypeOf(joao, homem);

var pedro = Object.create(homem);
pedro.nome = "Pedro";
pedro.idade = 18;

console.log(joao);
console.log(joao.sexo);

console.log(pedro);
console.log(pedro.sexo);