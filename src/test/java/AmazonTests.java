import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class AmazonTests {

    @Test
    public void AmazonTest() {
        Selenide.open("https://amazon.co.uk");
        HeadMenu headMenu = new HeadMenu();
        headMenu
                .goToSignIn()
                .signInByEmail("scorpio.sva2@gmail.com", "wisebitsQA!Task")
                .search("iphone 11 256Gb black")
                .sort("price-asc-rank")
                .goToFirstProductPage()
                .addProductToBasket()
                .goToBasket()
                .deleteProduct()
                .logOut();
    }
}
