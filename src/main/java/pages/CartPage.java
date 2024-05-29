package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement phoneItem = $(By.cssSelector("td:nth-child(2)"));
    private final SelenideElement placeOrder = $(By.cssSelector(".btn.btn-success")); // Corrected selector

    private final SelenideElement nameField = $(By.id("name"));
    private final SelenideElement countryField = $(By.id("country"));
    private final SelenideElement cityField = $(By.id("city"));
    private final SelenideElement creditCardField = $(By.id("card"));
    private final SelenideElement monthField = $(By.id("month"));
    private final SelenideElement yearField = $(By.id("year"));
    private final SelenideElement purchaseButton = $(By.xpath("//button[normalize-space()='Purchase']"));

    private final SelenideElement confirmationModal = $(By.xpath("//div[contains(@class,'showSweetAlert visible')]"));
    private final SelenideElement okButton = $(By.cssSelector(".confirm.btn.btn-lg.btn-primary")); // Corrected selector

    public void isPhonePresent() {
        phoneItem.should(appear);
    }

    public void placeOrder() {
        placeOrder.shouldBe(clickable).click();
    }

    public void fillOrderDetails(String name, String country, String city, String creditCard, String month, String year) {
        nameField.should(appear).setValue(name);
        countryField.should(appear).setValue(country);
        cityField.should(appear).setValue(city);
        creditCardField.should(appear).setValue(creditCard);
        monthField.should(appear).setValue(month);
        yearField.should(appear).setValue(year);
    }

    public void confirmPurchase() {
        purchaseButton.shouldBe(clickable).click();
    }

    public void handleConfirmation() {
        confirmationModal.shouldBe(visible);
        okButton.shouldBe(clickable).click();
    }
}
