angular.module("listaTelefonica", ["ngMessages"]);

angular.module("listaTelefonica").controller("listaTelefonicaCtrl", function ($scope) {
    $scope.app = "Lista Telefonica";

    $scope.contatos = [
        {
            nome: "Pedro",
            sobrenome: "Arruda",
            telefone: "999998888",
            operadora: "Oi",
            cor: "red"
        },
        {
            nome: "Ana",
            sobrenome: "Luiza",
            telefone: "999998877",
            operadora: "Vivo",
            cor: "yellow"
        },
        {
            nome: "Maria",
            sobrenome: "do Carmo",
            telefone: "999998866",
            operadora: "Tim",
            cor: "blue"
        }
    ];

    $scope.operadoras = [
        {
            nome: "Oi",
            codigo: 14,
            categoria: "Celular"
        },
        {
            nome: "Vivo",
            codigo: 15,
            categoria: "Celular"
        },
        {
            nome: "Tim",
            codigo: 41,
            categoria: "Celular"
        },
        {
            nome: "Claro",
            codigo: 44,
            categoria: "Celular"
        },
        {
            nome: "GVT",
            codigo: 25,
            categoria: "Fixo"
        },
        {
            nome: "Embratel",
            codigo: 21,
            categoria: "Fixo"
        }
    ]

    $scope.adicionarContato = function (contato) {
        $scope.contatos.push(angular.copy(contato));
        delete $scope.contato;
        $scope.contatoForm.$setPristine();
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
});