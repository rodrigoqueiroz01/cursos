angular.module("listaTelefonica").factory("errorInterceptor", function ($q, $location, $window) {
    let hasRedirected = false;

    return {
        responseError: function (rejection) {
            if (!hasRedirected && rejection.status === 404) {
                console.log("Erro 404 - Redirecionando para /error");
                hasRedirected = true;
                $location.path("/error");
                return $q.reject(rejection);
            }

            return $q.reject(rejection);
        }
    };
});