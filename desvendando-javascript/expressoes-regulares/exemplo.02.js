var regExp = /\(85\) 9999-9999/;
var telefone = "O telefone é (85) 9999-9999, tratar com João.";

console.log(regExp.exec(telefone));
console.log(regExp.test(telefone));