package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private final SelenideElement cartItem = $(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));


   public void chooseItem(){ cartItem.should(Condition.clickable).click();}

    public void navigateToInventory(){

    }
}
