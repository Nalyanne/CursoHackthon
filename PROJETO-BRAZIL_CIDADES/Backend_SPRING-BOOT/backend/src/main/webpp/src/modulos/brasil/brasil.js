import angular from 'angular';
import uirouter from 'angular-ui-router';

import BrasilController from './brasil.controller';

import brasilService from '../../servicos/brasil.service';

export default angular.module('myApp.brasil', [uirouter, brasilService])
  .controller('BrasilController', BrasilController)
  .name;

  