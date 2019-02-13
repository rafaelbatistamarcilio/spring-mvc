(function(){
    angular.module('app').controller('HomeController', HomeController);

    HomeController.$inject =[]

    function HomeController(){
        var vm = this;
        vm.$onInit = $onInit;

        function $onInit(){
            vm.teste = 'Olá mundo!';
        }
    }
})();

