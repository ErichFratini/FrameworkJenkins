package com.framework.steps.TaksItSteps;

import com.framework.Hooks;
import com.framework.pageobjects.TaskItPage.LoginPage;
import com.framework.support.Utils;
import com.framework.pageobjects.TaskItPage.CadastroPage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


import java.util.List;
import java.util.Map;

public class TaskItSteps {

    private Utils utils = new Utils(Hooks.getNavegador ());
    private CadastroPage cadastroPage = new CadastroPage (Hooks.getNavegador ());
    private LoginPage loginPage = new LoginPage (Hooks.getNavegador ());


    @Dado("^que acessei a plataforma \"([^\"]*)\"$")
    public void que_acessei_a_plataforma(String arg1) throws Exception {
        this.utils.navegarPara(arg1);
    }

    @Quando("^realizar o cadastro com as credenciais$")
    public void realizar_o_cadastro_com_as_credenciais(DataTable arg1) throws Exception {

        List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
        this.cadastroPage.botaoCadastro();
        this.cadastroPage.inserirNome(list.get(0).get("Nome"));
        this.cadastroPage.inserirLogin(list.get(0).get("Login"));
        this.cadastroPage.inserirSenha(list.get(0).get("Senha"));
        this.cadastroPage.botaoFinalizarCadastro();
        Thread.sleep(5000);
        }

    @Entao("^estarei logado com o usuario$")
    public void estarei_logado_com_o_usuario() throws Exception {
        this.cadastroPage.loginEfetuado();
        Thread.sleep(5000);
    }

    @Quando("^inserir as credenciais$")
    public void inserir_as_credenciais(DataTable arg1) throws Exception {
        this.loginPage.clicarLogin();
        List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
        this.loginPage.inserirLogin(list.get(0).get("Login"));
        this.loginPage.inserirSenha(list.get(0).get("Senha"));
        this.loginPage.botaoLogar();
        Thread.sleep(5000);
    }

    @Dado("^que estou logado na plataforma com as seguintes credenciais$")
    public void que_estou_logado_na_plataforma_com_as_seguintes_credenciais(DataTable arg1) throws Exception {
        this.loginPage.clicarLogin ();
        List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
        this.loginPage.inserirLogin(list.get(0).get("Login"));
        this.loginPage.inserirSenha(list.get(0).get("Senha"));
        this.loginPage.botaoLogar();
        Thread.sleep(5000);
        this.cadastroPage.loginEfetuado();
        Thread.sleep(5000);

    }

    @Dado("^na aba de ADD MORE DATA$")
    public void na_aba_de_ADD_MORE_DATA() throws Exception {
        this.loginPage.informacoesUsuario().abaMoreData().clicarBotaoAddMoreData();
    }

//    @Quando("^inserir os dados$")
//    public void inserir_os_dados(DataTable arg1) throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        throw new PendingException();
//    }
//
//    @Entao("^o contato será adicionado$")
//    public void o_contato_será_adicionado() throws Exception {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }


}
