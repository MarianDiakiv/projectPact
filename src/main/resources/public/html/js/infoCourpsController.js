var app = angular.module("CorpusApp",[]);
app.controller("CorpusController", function ($scope,$http) {
   $scope.courpsMass =[];
   $scope.courps={
       id: 0,
       street: "",
       title:""
   };
   refreshData();
   function refreshData() {
       $http({
           method:'GET',
           url:'/selectAllCorps'
       }).then(function (res) {
           $scope.courpsMass = res.data;
       },
           function (res) {
           console.log("ERROR" + res.status+ " "+ res.data);
       });
   };
   $scope.update = function () {
       var method = "";
       var url = "";
       if ($scope.courps.id==0){
            method="POST",
           url = '/saveCourps'
       }else {
           method="PUT",
               url='/saveCourps'
       }$http({
           method: method,
           url: url,
           data:angular.toJson($scope.courps),
           headers: {
               'Content-Type': 'application/json'
           }
       }).then(success, error);
   };
   
   $scope.editCourps = function (items) {
       $scope.courps.id= items.id;
       $scope.courps.title = items.title;
       $scope.courps.street = items.street;
   }

    function error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    };

    function clearForm() {
        $scope.courps.id=0;
        $scope.courps.street="";
        $scope.courps.title = "";
    }

    function success() {
        refreshData();
        clearForm();
    }


});