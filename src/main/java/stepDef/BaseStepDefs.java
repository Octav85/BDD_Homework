package stepDef;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BaseStepDefs {

    @When("the user opens the application")
    public void openApp(){

    }

    @And("Sleep {int}")
    public void sleep(int milliseconds) {
        Selenide.sleep(milliseconds);
    }
}
