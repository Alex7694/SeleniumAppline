package SberbankInsuarance.steps;

import SberbankInsuarance.pages.CatalogPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

public class CatalogSteps  {

    @Step("на странице есть заголовок - равный {0}")
    public void checkPageTitle(String expectedTitle) {
        CatalogPage catalogPage = new CatalogPage();
        String actualTitle = catalogPage.title.getText();
        Assert.assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("нажатие на кнопку Оформить онлайн")
    public void stepSendAppButton() {
        new CatalogPage().checkOnlineBtnClick(BaseStep.getDriver());
    }

    @Step("ожидание загрузки страницы")
    public void stepWaitSendAppClickable(WebDriver webDriver) {
        new CatalogPage().waitSendAppClickable(BaseStep.getDriver());
    }
}


