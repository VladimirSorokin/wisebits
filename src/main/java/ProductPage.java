import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private By addToCardButton = By.id("add-to-cart-button");

    @Step("Add product to basket")
    public HeadMenu addProductToBasket() {
        $(addToCardButton).shouldBe(Condition.visible).click();
        return new HeadMenu();
    }
}
