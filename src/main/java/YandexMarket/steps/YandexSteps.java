package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.YandexPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps  {

    @Step("Выбран пункт меню - {0}")
    public void stepSelectMarketSection(String menuItem) {
     new YandexPage().selectmarketSection(menuItem);
    }

    @Step("Закртытие вкладки Яндекс и переход во вкладку Маркет")
    public void stepWindowsHandlesManagment() {
        new YandexPage().windowsHandlesManagment();
    }
}
