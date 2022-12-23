package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import suport.Utils;

public class LoginPage extends RunCucumberTest {

    private By logo = new By.ByCssSelector("[alt='Itera logo']");
    private By inscrever = new By.ByCssSelector("[href='/UserRegister/NewUser']");

    public void acessoAPaginaLogin() {
        getDriver().get("https://itera-qa.azurewebsites.net");
        Utils.esperarElementoPresente(logo, 20);
    }

    public void acessoCadastroDeUsuario() {
        getDriver().findElement(inscrever).click();
    }
}
