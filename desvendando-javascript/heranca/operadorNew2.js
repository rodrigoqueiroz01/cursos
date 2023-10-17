var Homem = function (nome, idade) {
    this.nome = nome;
    this.idade = idade;
}

Homem.prototype.sexo = "masculino";

var joao = new Homem("João", 20);
console.log(joao);
console.log(joao.sexo);

var _new = function (func) {
    console.log(Array.prototype.slice.call(arguments, 1));
    var object = {};
    object.__proto__ = func.prototype;
    func.apply(object, ["Pedro", 18]);
    return object;
};

var pedro = _new(Homem, "Pedro", 18);

console.log(pedro);
console.log(pedro.sexo);

Homem.prototype.sexo = "feminino";
console.log(pedro.sexo);
console.log(joao.sexo);