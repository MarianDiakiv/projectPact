var app = angular.module("cabinetApp",[]);
app.controller("CabinetController", function ($scope,$http) {
    $scope.corps=[];
    $scope.idcourpusttourl=0;
    $scope.cabinets=[];
    $scope.cabinet={
         id: 0,
     number: 0,
     title: "",
     type: "",
        idCorps: 0
    };

    refreshData();
    //getIdCorps();

    function refreshData() {
      $http({
          method:'GET',
          url:'/showAllCabinets'
      }).then(function (res) {
          $scope.cabinets = res.data;
      },function (res) {
          console.log("ERRROR" + res.status+" "+ res.data);
      });
    };
$scope.editCabinet = function (items) {
    $scope.cabinet.id = items.id;
    console.log("id cab" + $scope.cabinet.id + " items id" +items.id );
    $scope.cabinet.number = items.number;
    $scope.cabinet.title = items.title;
    $scope.cabinet.type = items.type;
    $scope.cabinet.idCorps = items.idCorps;
    $scope.corps = [{id:items.idCorps}];
};
$scope.submitCabinet = function () {
    var method="";
    var url ="";
    //var idc =
   // console.log("if cabent id"  + $scope.cabinet.id+ "cdkjbvkjdb" + id)
    if ($scope.cabinet.id==0){
        method="POST";
        url='/saveCabinets';
        //$scope.cabinet.id =0;

    }else {
        method="PUT";
        url = '/saveCabinets';
    }
    //$scope.cabinet.idCorps = id;
    console.log("cab id " +$scope.cabinet.id + "courps " + $scope.cabinet.idCorps  ),
    $http({
        method: method,
        url: url,

        data: angular.toJson($scope.cabinet),
        headers:{
            'Content-Type': 'application/json'
        }
    }).then(success,error);
};

function success() {
    refreshData();
    clearFormData();

}
    function clearFormData(){
        $scope.cabinet.id = 0;
        $scope.cabinet.number = 0;
        $scope.cabinet.title = "";
        $scope.cabinet.type = "";
        $scope.cabinet.idCorps = 0;
    };
    function error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    };

    function getIdCorps() {
        $http({
            method:"GET",
            url:'/selectAllCorps'
        }).then(function (res) {
            $scope.corps = res.data;
        },function (res) {
                console.log("ERRROR" + res.status+" "+ res.data);
            }
            )

    };




});