package utils.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void setUp(){
        Configuration.browser = "edge";
        Configuration.baseUrl = "https://www.demoblaze.com";
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverRunner.getWebDriver().quit();
    }
}
