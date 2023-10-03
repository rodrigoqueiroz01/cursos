angular.module("listaTelefonica", []);

angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope) {
    $scope.app = "Lista Telefonica";

    $scope.contatos = [
        {nome: "Pedro", sobrenome: "Arruda", telefone: "999998888"},
        {nome: "Ana", sobrenome: "Luiza", telefone: "999998877"},
        {nome: "Maria", sobrenome: "do Carmo", telefone: "999998866"}
    ];

    $scope.adicionarContato = function (contato) {
        $scope.contatos.push(angular.copy(contato));
        delete $scope.contato;
    }
});