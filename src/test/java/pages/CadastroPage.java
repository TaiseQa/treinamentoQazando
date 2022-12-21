package pages;

import com.sun.jna.WString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;
    private By criarConta = new By.ByCssSelector("[href='/UserRegister/NewUser']");
    private By nome = new By.ById("FirstName");
    private By sobrenome = new By.ByCssSelector("[name='Surname']");
    private By telefone = new By.ById("Mobile");

    private By nomeDeUsuario = new By.ById("Username");

    private By senha = new By.ById("Password");

    private By ConfimeSenha = new By.ById("ConfirmPassword");

    private By submit = new By.ById("submit");

    private By msgDeSucesso = new By.ByXPath("//label[.='Registration Successful']");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cadastrar() {
        driver.findElement(criarConta).click();
    }

    public void preencherNome() {
        driver.findElement(nome).sendKeys(randomName());
    }

    public void preencherSegundoNome(String sobrenomee) {
        driver.findElement(sobrenome).sendKeys("sobrenomee");
    }

    public void preencherTelefone(String celular) {
        driver.findElement(telefone).sendKeys(celular);
    }

    public void preencherNomeDeUsuario() {
        driver.findElement(nomeDeUsuario).sendKeys(randomName());
    }

    public void preencherSenha(String Password) {
driver.findElement(senha).sendKeys(Password);
    }
    public void confirmarSenha(String confirmPassword){
        driver.findElement(ConfimeSenha).sendKeys(confirmPassword);
    }
    public void ClicarCadastrar(){
        driver.findElement(submit).click();
    }
    public String setMsgDeSucesso(){
       return driver.findElement(msgDeSucesso).getText();
    }
}
