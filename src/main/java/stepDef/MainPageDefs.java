package stepDef;

import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageDefs {

MainPage mainPage = new MainPage();

@When ("the user chooses an item")
    public void chooseItem(){
    mainPage.chooseItem();
}

}
