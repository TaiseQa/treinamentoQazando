package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {
    LoginPage loginPage = new LoginPage(driver);

    @Dado("que acesso a pagina home")
    public void acessoAPaginaLogin(){
        loginPage.acessoAPaginaLogin();

    }
}
