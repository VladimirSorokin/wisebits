import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeadMenu {
    private By searchInput = By.id("twotabsearchtextbox");
    private By signLink = By.id("nav-link-accountList");
    private By searchButton = By.id("nav-search-submit-button");
    private By basketLink = By.id("nav-cart");
    private By logOutLink = By.id("nav-item-signout");

    @Step("Search products by text = {0}")
    public SearchProductList search(String searchText) {
        $(searchInput).shouldBe(Condition.visible).setValue(searchText);
        $(searchButton).shouldBe(Condition.visible).click();
        return new SearchProductList();
    }

    @Step("Go to sign in page")
    public SignInPage goToSignIn() {
        $(signLink).shouldBe(Condition.visible).click();
        return new SignInPage();
    }

    @Step("Go to basket")
    public BasketPage goToBasket() {
        $(basketLink).shouldBe(Condition.visible).click();
        return new BasketPage();
    }

    @Step("Logout from account")
    public HeadMenu logOut() {
        $(signLink).shouldBe(Condition.visible).hover();
        $(logOutLink).shouldBe(Condition.visible).click();
        return this;
    }

}
