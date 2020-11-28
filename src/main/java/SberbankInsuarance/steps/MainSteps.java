package SberbankInsuarance.steps;

import SberbankInsuarance.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps  {

    @Step("выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage().selectMainMenu(menuItem);
    }

    @Step("выбрано - {0}")
    public void stepSelectSubMenu(String menuItem) {
        new MainPage().selectSubMenu(menuItem);
    }
}
