import angular from 'angular';

class BrasilService {

    constructor($http) {
        this.$http = $http;
        //const apiBase = "http://localhost:9090/projeto/api";
        const apiBase = "http://localhost:8080";
        this.path =  apiBase + "/brasil";
    }
    
    getBrasil() {
        return this.$http.get(this.path);
    }
}

export default angular.module('services.basil-service', [])
.service('brasilService', BrasilService)
.name;