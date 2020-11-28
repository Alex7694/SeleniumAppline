package YandexMarket.steps;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("Переход в раздел Наушники и Bluetooth-гарнитуры")
    public void stepSelectHeadphonesSection() {
     new ElectronicPage().HeadphonesSection.click();
    }

    @Step("Переход в раздел Телевизоры")
    public void stepSelectTvSection() {
        new ElectronicPage().TvSection.click();
    }
}
