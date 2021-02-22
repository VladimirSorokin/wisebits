import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private By emailInput = By.id("ap_email");
    private By passwordInput = By.id("ap_password");
    private By continueButton = By.id("continue");
    private By signInButton = By.id("signInSubmit");

    @Step("Sign in by email = {0} and password = {1}")
    public HeadMenu signInByEmail(String email, String password) {
        $(emailInput).shouldBe(Condition.visible).setValue(email);
        $(continueButton).shouldBe(Condition.visible).click();
        $(passwordInput).shouldBe(Condition.visible).setValue(password);
        $(signInButton).shouldBe(Condition.visible).click();

        return new HeadMenu();
    }
}
