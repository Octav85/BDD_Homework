package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InventoryPage;

public class InventoryStepDefs {
   InventoryPage inventoryPages = new InventoryPage();
@When("item is present in inventory page")
 public void isPhonePresent() {
        inventoryPages.isPhonePresent();
    }

@And("the user clicks to add item to cart")
    public void addPhone() {
        inventoryPages.addPhone();
    }

@And("the user navigates to the cart")
    public void navigateToCart() {
        inventoryPages.navigateToCart();
    }
}






