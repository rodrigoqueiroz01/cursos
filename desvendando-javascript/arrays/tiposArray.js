var carros = [];

carros[0] = {marca: "Ford", modelo: "Ka"}
carros[1] = {marca: "Chevrolet", modelo: "Corsa"}
carros[2] = {marca: "Fiat", modelo: "Palio"}

carros.filter(function (elemento) {
    return elemento.marca === "Ford";
});

carros.every(function (elemento) {
    return elemento.marca === "Ford";
}); // false

carros.some(function (elemento) {
    return elemento.marca === "Ford";
}); // true

carros.map(function (elemento) {
    return elemento.marca;
});

carros.map(function (elemento) {
    return elemento.modelo.length;
});

carros.reduce(function (prev, cur) {
    return prev + cur.preco;
}, 0); // 95550

var motos = ["Honda", "Yamaha"];

var veiculos = carros.concat(motos);

veiculos.toString(); // ['Ka', 'Corsa', 'Palio', 'Honda', 'Yamaha']

carros.slice(0, 2); // ['Ka', 'Corsa']
carros.slice(1, 3); // ['Corsa', 'Palio']
carros.slice(2); // ['Palio', 'Gol']

carros.reverse();
carros.toString(); // ['Gol', 'Palio', 'Corsa', 'Ka']

carros[0] = {marca: "Ford", modelo: "Ka", preco: 28800}
carros[1] = {marca: "Chevrolet", modelo: "Corsa", preco: 34750}
carros[2] = {marca: "Fiat", modelo: "Palio", preco: 32000}

carros.sort(function (a, b) {
    return a.preco - b.preco;
})
carros.valueOf(); // ['Ka', 'Palio', 'Corsa']

carros.join('; '); // "Ka; Corsa; Palio; Gol"