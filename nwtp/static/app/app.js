angular.module("finApp", ["ui.bootstrap", "ngRoute", "ngAnimate", "finNwt", "menu"])
  .config(["$routeProvider", function ($routeProvider) {

    $routeProvider.when("/networth", {
      controller: "NumbersController",
      controllerAs: "nums",
      templateUrl: "app/nwt/views/numbers-view.html"
    });


  }]);
