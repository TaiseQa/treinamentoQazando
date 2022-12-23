package suport;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static runner.RunBase.getDriver;

public class Utils {
    public static void esperarElementoPresente(By elemente, int i){
        WebDriverWait wait = new WebDriverWait(getDriver(), i);
        wait.until(ExpectedConditions.elementToBeClickable(elemente));
    }

    public static String randomName(){
        String emailInt = "Qazando_";

        Random random = new Random();
        int minimo = 1;
        int maximo = 99999999;
        int resultado = random.nextInt(maximo-minimo)+ minimo;

        return emailInt + resultado;
    }
}
