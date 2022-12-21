package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {
    CadastroPage cadastroPage = new CadastroPage(driver);


    @E("acesso cadastro de usuario")
    public void acessoCadastroDeUsuario() {
        cadastroPage.cadastrar();
        
    }

    @Quando("preencho formulario de cadastro")
    public void preenchoFormularioDeCadastro() {
        cadastroPage.preencherNome();
        cadastroPage.preencherSegundoNome("Almeida");
        cadastroPage.preencherTelefone("11976809209");
        cadastroPage.preencherNomeDeUsuario();
        cadastroPage.preencherSenha("12345678");
        cadastroPage.confirmarSenha("12345678");
        
    }

    @E("clico em registrar")
    public void clicoEmRegistrar() {
        cadastroPage.ClicarCadastrar();
        
    }

    @Entao("valido a mensagem cadastro realizado com sucesso")
    public void validoAMensagemCadastroRealizadoComSucesso() {
        Assert.assertEquals("Registration Successful", cadastroPage.setMsgDeSucesso());
    }
}
