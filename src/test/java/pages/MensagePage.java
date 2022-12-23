package pages;

import org.openqa.selenium.By;
import suport.Utils;

import static runner.RunBase.getDriver;

public class MensagePage {
    private By contato = new By.ByCssSelector("[href='/contact_us']");
    private By nome = new By.ByCssSelector("[data-qa='name']");
    private By email = new By.ByCssSelector("[data-qa='email']");
    private By sujeito = new By.ByCssSelector("[data-qa='subject']");
    private By mensagem = new By.ById("message");
    private By uploud = new By.ByCssSelector("[name='upload_file']");
    private By submit = new By.ByCssSelector("[data-qa='submit-button']");

    public void que_estou_na_home() {
        getDriver().get("https://automationexercise.com");
        Utils.esperarElementoPresente(contato, 10);
    }

    public void clico_em_mensagem() {
        getDriver().findElement(contato).click();
    }

    public void preencho_todos_os_campos() {
        getDriver().findElement(nome).sendKeys("Taise");
        getDriver().findElement(email).sendKeys("teste@test.com.br");
        getDriver().findElement(sujeito).sendKeys("teste");
        getDriver().findElement(mensagem).sendKeys("Teste");
        getDriver().findElement(uploud).sendKeys("D:/img/avatar.png");
    }

    public void clico_em_enviar_mensagem() {
        getDriver().findElement(submit).click();
    }

    public String vejo_mensagem_com_sucesso() {
        String mensage = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();
        return mensage;
    }
}
