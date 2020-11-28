package SberbankInsuarance.steps;

import SberbankInsuarance.pages.ProductSelectionPage;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class ProductSelectionSteps  {


    @Step("Нажатие на кнопку Оформить")
    public void checkoutButton() {
        new ProductSelectionPage().checkoutBtn.click();
    }

    @Step("Ожидание загрузки страницы")
    public void waitSendApplickable(WebDriver driver) {
        ProductSelectionPage productSelectionSteps = new ProductSelectionPage();
        productSelectionSteps.waitSendAppClickable(driver);
    }
}
