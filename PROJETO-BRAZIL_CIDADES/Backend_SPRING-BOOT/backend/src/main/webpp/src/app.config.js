routing.$inject = ['$stateProvider', '$urlRouterProvider'];

export default function routing($stateProvider, $urlRouterProvider) {
    let homeState = {
        name: 'home',
        url: '/home',
        templateUrl: './modulos/home/home.view.html',
        controller: 'HomeController',
        controllerAs: 'vm'
      }
      $stateProvider.state(homeState);
      
      let brasilState = {
        name: 'brasil',
        url: '/brasil',
        templateUrl: './modulos/brasil/brasil.view.html',
        controller: 'BrasilController',
        controllerAs: 'vm'
      }
      $stateProvider.state(brasilState);



      
      // let salvarState = {
      //   name: 'salvar',
      //   url: '/brasil/salvar',
      //   templateUrl: './modulos/brasil/salvar/salvar.html',
      //   controller: 'BrasilController',
      //   controllerAs: 'vm'
      // }
      // $stateProvider.state(salvarState);
      
      $urlRouterProvider.otherwise('/home')  
}