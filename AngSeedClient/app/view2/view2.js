'use strict';

angular.module('myApp.view2', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/view2', {
              templateUrl: 'view2/view2.html',
              controller: 'View2Ctrl'
            });
          }])

        .controller('View2Ctrl', function ($http, $scope) {
          $http({
            method: 'GET',
            url: 'api/footballclubs'
          }).then(function successCallback(res) {
            $scope.data = res.data;
          }, function errorCallback(res) {
            $scope.error = res.status + ": "+ res.data.statusText;
          });

        });