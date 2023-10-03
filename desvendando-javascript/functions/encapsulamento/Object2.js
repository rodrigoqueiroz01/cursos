var counter = function () {
    var value = 0;
    var add = function () {
        return ++value;
    };
};

console.log(counter.value) // undefined
console.log(counter.add()) // undefined

var itens = function () {
    var value = [];
    var add = function (item) {
        value.push(item);
        return value;
    };
};