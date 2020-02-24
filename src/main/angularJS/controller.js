var app = angular.module('mainApp', []);

app.controller('people', function($scope,$http){

$http.get('http://localhost:8080/person/all').success(function (response) {
        //$scope.persons=response;
    console.log('------response -----');
    console.log(response);
    });


});