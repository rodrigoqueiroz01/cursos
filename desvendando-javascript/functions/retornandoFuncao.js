var helloWorld = function () {
    return function () {
        return "Hello World!";
    };
};

console.log(helloWorld)
console.log(helloWorld()()) // [Function]