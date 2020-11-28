package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ProductSteps  {

    @Step("Нажатие на кнопку Все фильтры ")
    public void stepAllfiltersBtn() {
        new ProductPage().AllfiltersBtn.click();
    }
}
