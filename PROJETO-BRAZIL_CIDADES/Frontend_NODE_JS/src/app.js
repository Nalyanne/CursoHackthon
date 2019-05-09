'use strict';

import angular from 'angular'
import uirouter from 'angular-ui-router';
var blockUI = require('angular-block-ui');

import 'bootstrap';
import './scss/app.scss';

import routing from './app.config';

import dono from './modulos/dono/dono.js';
import home from './modulos/home/home.js';
import brasil from './modulos/brasil/brasil.js';
//import brasil from './modulos/brasil/salvar.js';

angular
.module('myApp', [
  uirouter,
  blockUI,
  dono,
  brasil, 
//  salvar,
  home
])
.config(routing);