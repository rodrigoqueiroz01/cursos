var regExp = /\(\d{2}\)\s\d{4,5}-?\d{4}/g;

var telefone = "<table><tr><td>(80) 999998888</td><td>(90) 97777-6666</td><td>(80) 9999-8888</td></tr></table>";
console.log(telefone.replace(regExp, 'telefone'));