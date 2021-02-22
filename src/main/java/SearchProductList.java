import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchProductList {

    private By sortSelect = By.id("s-result-sort-select");
    private By firstElementLink = By.xpath("//div[@class='a-section a-spacing-none' " +
            "and ancestor::div[@data-index='1'] and descendant::img]");

    @Step("Sort products list")
    public SearchProductList sort(String sortSelectValue) {
        $(sortSelect).selectOptionByValue("price-asc-rank");
        return this;
    }

    @Step("Go to first in list products page")
    public ProductPage goToFirstProductPage() {
        $(firstElementLink).shouldBe(Condition.enabled).click();
        return new ProductPage();
    }

}
