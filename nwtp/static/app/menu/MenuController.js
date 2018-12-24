(function () {

    angular.module("menu").controller("MenuController", MenuController);

    MenuController.$inject = ["$location"];
    function MenuController($location) {

        var vm = this;

        vm.isCollapsed = true;
        vm.links = [
            {
                url: "#/netWoth", text: "NetWorth tracker"
            },
            {
                url: "#/placeHolder", text: "PlaceHolder"
            }
        ];

        vm.isActive = isActive;

        function isActive(viewLocation) {
            var isActive = $location.path().indexOf(
                viewLocation.substr(1)) > -1;
            console.log("" + viewLocation + ":" + isActive);
            return isActive;
        }

    }

})();
