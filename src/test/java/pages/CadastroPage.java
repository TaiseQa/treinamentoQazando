package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;

import static suport.Utils.randomName;

public class CadastroPage extends RunCucumberTest {

    private By criarConta = new By.ByCssSelector("[href='/UserRegister/NewUser']");
    private By nome = new By.ById("FirstName");
    private By sobrenome = new By.ByCssSelector("[name='Surname']");
    private By telefone = new By.ById("Mobile");
    private By nomeDeUsuario = new By.ById("Username");
    private By senha = new By.ById("Password");
    private By ConfimeSenha = new By.ById("ConfirmPassword");
    private By submit = new By.ById("submit");
    private By msgDeSucesso = new By.ByXPath("//label[.='Registration Successful']");

    public void preencherNome() {
        getDriver().findElement(nome).sendKeys(randomName());
    }

    public void preencherSegundoNome(String sobrenomee) {
        getDriver().findElement(sobrenome).sendKeys("sobrenomee");
    }

    public void preencherTelefone(String celular) {
        getDriver().findElement(telefone).sendKeys(celular);
    }

    public void preencherNomeDeUsuario() {
        getDriver().findElement(nomeDeUsuario).sendKeys(randomName());
    }

    public void preencherSenha(String Password) {
        getDriver().findElement(senha).sendKeys(Password);
    }

    public void confirmarSenha(String confirmPassword) {
        getDriver().findElement(ConfimeSenha).sendKeys(confirmPassword);
    }

    public void ClicarCadastrar() {
        getDriver().findElement(submit).click();
    }

    public String setMsgDeSucesso() {
        return getDriver().findElement(msgDeSucesso).getText();
    }
}
