#language: pt
  Funcionalidade: Automatizar o site do Julio de Lima, TaskIt

    Contexto: Estar na plataforma
      Dado que acessei a plataforma "http://www.juliodelima.com.br/taskit/"

    @ID1 @CadastrarUmUsuario
      Cenario: Criar um usuario na plataforma TaskIt
      Quando realizar o cadastro com as credenciais
        | Nome    | Login   | Senha  |
        | Jenkins | Jenkins | Jenkins|
      Entao estarei logado com o usuario

    @ID2 @RealizarLogin
      Cenario: Logar com um usuario na plataforma TaskIt
      Quando inserir as credenciais
        | Login   | Senha  |
        | Jenkins | Jenkins|
      Entao estarei logado com o usuario

