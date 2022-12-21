package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    private By logo = new By.ByCssSelector("[alt='Itera logo']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessoAPaginaLogin() {
        driver.get("https://itera-qa.azurewebsites.net");
        esperarElementoPresente(logo, 20);
    }
    public void acessoCadastroDeUsuario() {


    }
}
