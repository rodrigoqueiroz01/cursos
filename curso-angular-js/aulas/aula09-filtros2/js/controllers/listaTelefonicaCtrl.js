angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope, contatosAPI, operadorasAPI, serialGenerator) {
    console.log("Serial Generator: " + serialGenerator.generate());

    $scope.app = "Lista Telefonica";
    $scope.contatos = [];
    $scope.operadoras = [];

    var carregarOperadoras = function () {
        operadorasAPI.getOperadoras().then(function (response){
            $scope.operadoras = response.data;
        });
    }

    var carregarContatos = function () {
        contatosAPI.getContatos().then(function (response){
            $scope.contatos = response.data;
        }).catch(function (data, status) {
            $scope.message = "[ERRO] - " + data;
        });
    }

    $scope.adicionarContato = function (contato) {
        console.log(contato);
        contato.serial = serialGenerator.generate();

        contato.data = new Date();

        contatosAPI.saveContato(contato).then(function (data) {
            delete $scope.contato;
            $scope.contatoForm.$setPristine();
            carregarContatos();
        });
    }

    $scope.apagarContatos = function (contatos) {
        $scope.contatos = contatos.filter(function (contato) {
            if (!contato.selecionado) return contato;
        });
    }

    $scope.isContatoSelecionado = function (contatos) {
        return contatos.some(function (contato) {
            return contato.selecionado;
        });
    }

    $scope.ordenarPor = function (campo) {
        $scope.criterioDeOrdenacao = campo;
        $scope.direcaoDaOrdenacao = !$scope.direcaoDaOrdenacao;
    }

    carregarContatos();
    carregarOperadoras();
});