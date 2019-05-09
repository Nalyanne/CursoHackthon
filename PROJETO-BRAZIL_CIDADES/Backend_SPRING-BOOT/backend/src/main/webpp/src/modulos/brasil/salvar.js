import angular from 'angular';
import uirouter from 'angular-ui-router';

import BrasilController from './brasil.controller';

import brasilService from '../../servicos/salvar.service';

export default angular.module('myApp.brasil', [uirouter, salvarService])
  .controller('BrasilController', BrasilController)
  .name;

  