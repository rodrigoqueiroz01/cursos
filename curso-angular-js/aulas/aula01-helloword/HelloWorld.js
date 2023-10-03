// cria o módulo
var app = angular.module("helloWorld", []);

// localiza o módulo
angular.module("helloWorld").controller("helloWorldCtrl", function ($scope) {
    $scope.message = "Hello World!";
});