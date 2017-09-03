'use strict';

angular.module('myApp').controller('DoctorController', ['$scope', 'DoctorService', function($scope, DoctorService) {
    var self = this;
    self.doctors={id:null,name:'',surname:'',specialization:''};
    self.doctors=[];


    fetchAllDoctors();

    function fetchAllDoctors(){
        DoctorService.fetchAllDoctors()
            .then(
                function(d) {
                    self.doctors = d;
                },
                function(errResponse){
                    console.error('Error while fetching doctors');
                }
            );
    }
}]);