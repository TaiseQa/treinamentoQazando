#language:pt
@cadastro
Funcionalidade: cadastro de usuario

  @cadastro_sucesso
  Cenario: registrar novo usuario com sucesso
    Dado que acesso a pagina home
    E acesso cadastro de usuario
    Quando preencho formulario de cadastro
    E clico em registrar
    Entao valido a mensagem cadastro realizado com sucesso

