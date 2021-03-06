(function (ng) {
    var mod = ng.module('roleModule', ['ngCrud']);
    mod.controller('roleCtrl', ['$rootScope', 'Restangular','$state', function ($rootScope, Restangular) {
        $rootScope.auth = function () { 
                Restangular.all("users").customGET('me').then(function (response) {
                    if (response == null || response === undefined) {
                        $rootScope.category = false;
                        $rootScope.agency = false;
                        $rootScope.client = false;
                        $rootScope.wishlist = false;
                        $rootScope.product = false;
                        $rootScope.visitor = true;
                        var roles = $rootScope.roles = ["visitor"];
                    } else {
                        var roles = $rootScope.roles = response.roles;
                        if (roles.indexOf("client") !== -1) {
                            $rootScope.category = false;
                            $rootScope.agency = false;
                            $rootScope.client = true;
                            $rootScope.wishlist = true;
                            $rootScope.product = false;
                            $rootScope.visitor = false;
                        }
                        else if (roles.indexOf("agency") !== -1) {
                            $rootScope.category = false;
                            $rootScope.agency = true;
                            $rootScope.client = false;
                            $rootScope.wishlist = false;
                            $rootScope.product = false;
                            $rootScope.visitor = false;
                        }
                        else if (roles.indexOf("admin") !== -1) {
                            $rootScope.category = true;
                            $rootScope.agency = true;
                            $rootScope.client = true;
                            $rootScope.wishlist = false;
                            $rootScope.product = true;
                            $rootScope.visitor = false;
                        }
                    }
                });
            };
        $rootScope.auth();
        $rootScope.$on('logged-in', function () {
            $rootScope.auth();
        });

        $rootScope.$on('logged-out', function () {
            $rootScope.auth();
        });
    }]);
})(window.angular);




