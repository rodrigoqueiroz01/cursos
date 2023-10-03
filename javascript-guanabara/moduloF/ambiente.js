var numeros = [5, 8, 2, 9, 3];

numeros.push(1) // adiciona uma posição no vetor
numeros.sort() // colocar em ordem crescente

/*
for (var i = 0; i < numeros.length; i++) {
    console.log(i)
}
*/

for (var numero in numeros) {
    console.log(numero)
}

/*

Em Java:

for (var numero : numeros) {
    System.out.println(numero);
}
*/

console.log(numeros.indexOf(3))