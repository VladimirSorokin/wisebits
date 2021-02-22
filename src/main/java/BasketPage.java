import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage {
    private By deleteButton = By.xpath("//span[parent::span[@data-action='delete']]");

    @Step("Delete product from basket")
    public HeadMenu deleteProduct() {
        $(deleteButton).shouldBe(Condition.visible).click();
        return new HeadMenu();
    }

}
