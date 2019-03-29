$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TaskIt.feature");
formatter.feature({
  "name": "Automatizar o site do Julio de Lima, TaskIt",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Estar na plataforma",
  "description": "",
  "keyword": "Contexto"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acessei a plataforma \"http://www.juliodelima.com.br/taskit/\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "TaskItSteps.que_acessei_a_plataforma(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Logar com um usuario na plataforma TaskIt",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ID2"
    },
    {
      "name": "@RealizarLogin"
    }
  ]
});
formatter.step({
  "name": "inserir as credenciais",
  "rows": [
    {
      "cells": [
        "Login",
        "Senha"
      ]
    },
    {
      "cells": [
        "Jenkins",
        "Jenkins"
      ]
    }
  ],
  "keyword": "Quando "
});
formatter.match({
  "location": "TaskItSteps.inserir_as_credenciais(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "estarei logado com o usuario",
  "keyword": "Entao "
});
formatter.match({
  "location": "TaskItSteps.estarei_logado_com_o_usuario()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});