#language:pt
@mensagemComSucesso
Funcionalidade: que estou na tela de mensagem

  Cenario: enviar mensagem de sucesso
    Dado que estou na home
    Quando clico em mensagem
    E preencho todos os campos
    E clico em enviar mensagem
    Entao vejo mensagem com sucesso
