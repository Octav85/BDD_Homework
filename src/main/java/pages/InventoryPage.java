package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;


public class InventoryPage {
    private final SelenideElement phoneItem = $(By.cssSelector(".name"));
    private final SelenideElement addPhoneToCart = $(By.cssSelector(".btn.btn-success.btn-lg"));
    private final SelenideElement cartItem = $(By.xpath("//a[normalize-space()='Cart']"));

    public void isPhonePresent() {
        phoneItem.should(appear);
    }

    public void addPhone() {
        addPhoneToCart.shouldBe(clickable).click();
        handleAlert();
    }

    private void handleAlert() {
        switchTo().alert().accept();
    }

    public void navigateToCart() {
        cartItem.should(Condition.appear).click();
    }
}

