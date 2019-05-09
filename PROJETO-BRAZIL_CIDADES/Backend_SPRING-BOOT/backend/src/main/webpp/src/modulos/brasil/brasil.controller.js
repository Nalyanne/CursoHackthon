import { inherit } from "@uirouter/core";

export default class BrasilController {

  constructor(brasilService) {
    var vm = this;
    this.name = 'Brasil';

    init();

    function init(){
      brasilService.getBrasil().then(function abc(resp) {
        vm.brasil = resp.data;
      });
    }

   // function init(){
   //   brasilService.postBrasil().then(function abc(resp){
   //     vm.salvar = resp.data;
   //   })
   // }
  }
  
}
BrasilController.$inject = ['brasilService'];
