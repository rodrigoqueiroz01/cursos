var produto = {
    nome: "Sapato",
    preco: 150.00
}

var formulaImpostoA = function (preco) {
    return preco * 0.1;
}

var formulaImpostoB = function (preco) {
    return preco * 0.2;
}

// Passar função como parâmetro.

var calcularPreco = function (produto, formulaImposto) {
    return produto.preco + formulaImposto(produto.preco);
}

console.log(calcularPreco(produto, formulaImpostoA)) // 165
console.log(calcularPreco(produto, formulaImpostoB)) // 180