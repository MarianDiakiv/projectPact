var app = angular.module("electronicApp",[]);
app.controller("electronicController", function ($scope, $http) {

    $scope.electronics=[];
    $scope.electronic={
        id:0,
        type: "",
        maker: "",
        model: "",
        description: "",
        idStorage: 0,
        idCabinet: 0
    };
    $scope.cabinets=[];

    refreshData();
    getCabinets();
    function getCabinets() {
        $http({
            method:'GET',
            url:'/showAllCabinets'
        }).then(function (res) {
            $scope.cabinets = res.data;
        },function (res) {
            console.log("error + " + res.status + " " + res.data);
        });
    };

    function refreshData() {
        $http({
            method: 'GET',
            url: '/showAllElectronic'
        }).then(function (res) {
            $scope.electronics = res.data;
        },function (res) {
            console.log("error + " + res.status + " " + res.data);
        });
    };
    $scope.edit = function(items){
        $scope.electronic.id = items.id;
        $scope.electronic.type = items.type;
        $scope.electronic.maker = items.maker;
        $scope.electronic.model = items.model;
        $scope.electronic.description = items.description;
        $scope.electronic.idStorage = items.idStorage;
        $scope.electronic.idCabinet = items.idCabinet;

    };


    $scope.submit = function () {
        var method="";
        var url = "";
        if ($scope.electronic.id==0){
            method="POST";
            url="/saveElectronic";
        } else {
            method="PUT";
            url="/updateElectronic";
        }
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.electronic),
            headers:{
                'Content-Type': 'application/json'
            }
        }).then(success,error);
    };

    function success() {
        refreshData();
        clearFormData();
    }
    function error(res){
        var data = res.data;
        var status = res.status;
        // var header = res.header;
        // var config = res.config;
        alert("Error: " + status + ":" + data );
    };
    function clearFormData() {
        $scope.electronic={
            id:0,
            type: "",
            maker: "",
            model: "",
            description: "",
            idStorage: 0,
            idCabinet: 0
        };
    }
});