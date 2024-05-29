package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartStepDefs {

    CartPage cartPage = new CartPage();

    @And("the item should be in the cart")
    public void isItemPresent(){
        cartPage.isPhonePresent();

    }
    @And("the user places the order")
        public void placeOrder(){
          cartPage.placeOrder();
        }

    @And("the user fills in their data")
    public void fillData() {
        cartPage.fillOrderDetails("Jon","Zambia","Lusaka","224876444","11","2022");

    }
    @And("the user clicks on purchase")
    public void confirmPurchase(){
        cartPage.confirmPurchase();
    }
    @Then("the purchase is confirmed")
    public void closePurchasePage(){
        cartPage.handleConfirmation();
    }
}

