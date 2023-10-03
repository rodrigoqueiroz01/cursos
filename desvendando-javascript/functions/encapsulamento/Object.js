var counter = {
    value: 0,
    add: function () {
        return ++this.value;
    }
};

console.log(counter.add());
counter.value = undefined;
counter.add(); // NaN

var itens = {
    value: [],
    add: function (item) {
        this.value.push(item);
        return this.value;
    }
};

console.log(itens.add('A'));