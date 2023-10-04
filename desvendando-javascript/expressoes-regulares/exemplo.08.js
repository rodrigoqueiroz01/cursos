var regExp = /<table><tr>(<td>\([0-9]{2}\) [0-9]{4,5}-?[0-9]{4}<\/td>)+<\/tr><\/table>/;

var telefone = "<table><tr><td>(80) 999998888</td><td>(90) 97777-6666</td><td>(80) 9999-8888</td></tr></table>";
console.log(regExp.test(telefone));