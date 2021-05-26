import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SecondTest {

        @BeforeAll
        static void setup() {
            Configuration.browser = "firefox";
            Configuration.startMaximized = true;
        }

        @Test
        public  void CheckOnPage() {

            open("https://admctl.skt-globus.com.ua/#/");
            $(By.name("login")).setValue("hydra");
            $(By.name("password")).setValue("hydra");
            $(By.name("russian")).click();
            $(By.name("send")).click();

            $(By.xpath("//input[@class='search_input']")).setValue("probeg");
            sleep(3000);
            $(By.xpath("//button[@class='goToClient']")).click();
            sleep(3000);
            switchTo().window(1);
            sleep(3000);



    }
}
