function parImpar(numero) {
    if (numero % 2 == 0) {
        return 'par'
    } else {
        return 'impar'
    }
}

function soma(valor1 = 0, valor2 = 0) {
    return valor1 + valor2
}

function media(n1, n2, n3, n4) {
    return (n1 + n2 + n3 + n4) / 4
}

let v = function(x) {
    return x*2
}

console.log(`Par ou Ímpar: ${parImpar(10)}`)
console.log(`Soma: ${soma(7, 3)}`)
console.log(`Média: ${media(10, 6, 3.5, 9)}`)
console.log(`Function dentro de uma variável: ${v(5)}`)