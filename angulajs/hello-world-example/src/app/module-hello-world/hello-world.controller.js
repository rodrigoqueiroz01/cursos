(function () {
    'use strict';

    angular
        .module('module-hello-world')
        .controller('HelloWorldController', HelloWorldController);

    /* @ngInject */
    function HelloWorldController($scope) {
        var vm = this;

        vm.message = '';

        init();

        ////////////////

        function init() {
            vm.message = 'Hello World!';
        }

    }
})();