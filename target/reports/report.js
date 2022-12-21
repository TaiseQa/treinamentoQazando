$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "cadastro de usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "registrar novo usuario com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuario-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@cadastro_sucesso"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que acesso a pagina home",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "acesso cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "preencho formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "valido a mensagem cadastro realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.acessoAPaginaLogin()"
});
formatter.result({
  "duration": 2184903700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.acessoCadastroDeUsuario()"
});
formatter.result({
  "duration": 459361700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.preenchoFormularioDeCadastro()"
});
formatter.result({
  "duration": 624265000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clicoEmRegistrar()"
});
formatter.result({
  "duration": 1950259800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.validoAMensagemCadastroRealizadoComSucesso()"
});
formatter.result({
  "duration": 61724800,
  "status": "passed"
});
});