angular.module("menu", ["ngRoute"])
    .config(["$routeProvider", function ($routeProvider) {
        $routeProvider.otherwise("/networth");
    }]);
