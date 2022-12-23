package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.MensagePage;
import runner.RunCucumberTest;

public class MensageSteps extends RunCucumberTest {

    MensagePage mansagePage = new MensagePage();

    @Dado("^que estou na home$")
    public void que_estou_na_home() {
        mansagePage.que_estou_na_home();
    }

    @Quando("^clico em mensagem$")
    public void clico_em_mensagem() {
        mansagePage.clico_em_mensagem();
    }

    @E("^preencho todos os campos$")
    public void preencho_todos_os_campos() {
        mansagePage.preencho_todos_os_campos();
    }

    @E("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        mansagePage.clico_em_enviar_mensagem();
    }

    @Entao("^vejo mensagem com sucesso$")
    public void vejo_mensagem_com_sucesso() {
        Assert.assertEquals("Press OK to proceed!", mansagePage.vejo_mensagem_com_sucesso());
    }

}
