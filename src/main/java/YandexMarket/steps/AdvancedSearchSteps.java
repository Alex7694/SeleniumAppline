package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.AdvancedSearchPage;
import ru.yandex.qatools.allure.annotations.Step;


public class AdvancedSearchSteps  {


    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new AdvancedSearchPage().fillField(field,  value);
    }

    @Step("Активация чекбокса Beats")
    public void stepBeatsCheckbox() {
        new AdvancedSearchPage().BeatsCheckbox.click();
    }

    @Step("Активация чекбокса Lg")
    public void stepLgCheckbox() {
        new AdvancedSearchPage().LgCheckbox.click();
    }

    @Step("Активация чекбокса Samsung")
    public void stepSamsungCheckbox() {
        new AdvancedSearchPage().SamsungCheckbox.click();
    }

    @Step("Нажатие на кнопку Показать")
    public void stepShowButton() {
        new AdvancedSearchPage().ShowButton.click();
    }

}
