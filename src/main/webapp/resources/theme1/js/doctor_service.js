'use strict';

angular.module('myApp').factory('DoctorService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:9090/team/doctor/';

    var factory = {
        fetchAllDoctors: fetchAllDoctors,
    };

    return factory;

    function fetchAllDoctors() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
                function (response) {
                    deferred.resolve(response.data);
                },
                function(errResponse){
                    console.error('Error while fetching doctors');
                    deferred.reject(errResponse);
                }
            );
        return deferred.promise;
    }
}]);