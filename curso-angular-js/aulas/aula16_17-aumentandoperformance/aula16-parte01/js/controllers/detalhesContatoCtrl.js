angular.module("listaTelefonica").controller("detalhesContatoCtrl", function ($scope, $routeParams, contato, $location) {
	if (contato.status === 404) {
		$location.path("/error");
		return;
	}

	$scope.contato = contato.data;
});