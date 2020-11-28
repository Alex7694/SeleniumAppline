package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    @Step("Выбор пункта меню - {0}")
    public void stepSelectElectonicSection(String menuItem) {
     new MarketPage().selectElectonicSection(menuItem);
    }
}
