// ^ -> Início
// $ -> Fim

var regExp = /^\(85\) 9999-9999$/;
var telefone = "(85) 9999-9999";

console.log(regExp.exec(telefone));
console.log(regExp.test(telefone));