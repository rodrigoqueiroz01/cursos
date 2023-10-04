// Quantificadores - Parte 02

var regExp = /^\([0-9]{2}\) [0-9]{4,5}-[0-9]{4}$/;

var telefone1 = "(88) 9876-1239";
console.log(regExp.test(telefone1));

var telefone2 = "(88) 99876-1239";
console.log(regExp.test(telefone2));