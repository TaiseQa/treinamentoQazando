package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage();

    @Dado("que acesso a pagina home")
    public void acessoAPaginaLogin() {
        getDriver(Browser.CHROME);
        loginPage.acessoAPaginaLogin();
    }

    @E("acesso cadastro de usuario")
    public void acessoCadastroDeUsuario() {
        loginPage.acessoCadastroDeUsuario();
    }
}
