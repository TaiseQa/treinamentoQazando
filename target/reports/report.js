$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/mensager.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "que estou na tela de mensagem",
  "description": "",
  "id": "que-estou-na-tela-de-mensagem",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@mensagemComSucesso"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "enviar mensagem de sucesso",
  "description": "",
  "id": "que-estou-na-tela-de-mensagem;enviar-mensagem-de-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 6,
  "name": "que estou na home",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "clico em mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "preencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 9,
  "name": "clico em enviar mensagem",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "vejo mensagem com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "MensageSteps.que_estou_na_home()"
});
formatter.result({
  "duration": 5411292700,
  "status": "passed"
});
formatter.match({
  "location": "MensageSteps.clico_em_mensagem()"
});
formatter.result({
  "duration": 1991770900,
  "status": "passed"
});
formatter.match({
  "location": "MensageSteps.preencho_todos_os_campos()"
});
formatter.result({
  "duration": 417564100,
  "status": "passed"
});
formatter.match({
  "location": "MensageSteps.clico_em_enviar_mensagem()"
});
formatter.result({
  "duration": 101533800,
  "status": "passed"
});
formatter.match({
  "location": "MensageSteps.vejo_mensagem_com_sucesso()"
});
formatter.result({
  "duration": 29292900,
  "status": "passed"
});
});