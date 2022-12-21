package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.SecureRandom;
import java.util.Random;

import static runner.RunCucumberTest.driver;

public class Utils {
    public void esperarElementoPresente(By elemente, int i){
        WebDriverWait wait = new WebDriverWait(driver, i);
        wait.until(ExpectedConditions.elementToBeClickable(elemente));
    }

    public String randomName(){
        String emailInt = "Qazando_";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo)+ minimo;

        return emailInt + resultado;
    }
}
