var helloWorld = function () {
    var message = "Hello World!";
    return function () {
        return message;
    };
};

var fnHelloWorld = helloWorld();
console.log(fnHelloWorld());