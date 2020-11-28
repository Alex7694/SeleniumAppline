package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.ResultSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSearchSteps {

    @Step("Вывдено результатов поисковой выдачи на странице: {0}")
    public void stepcheckCountOfResultElements(int expectedCount) {
        new ResultSearchPage().checkCountOfResultElements(expectedCount);
    }

    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new ResultSearchPage().fillField(field, value);
    }

    @Step("Поле {0} заполнено значением: {1}")
    public void stepCheckFillField(String field, String value) {
        new ResultSearchPage().checkFillField(field, value);
    }
}
