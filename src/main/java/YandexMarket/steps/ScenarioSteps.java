package YandexMarket.steps;

import YandexMarket.pages.ResultSearchPage;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    MarketSteps marketSteps = new MarketSteps();
    ProductSteps productSteps = new ProductSteps();
    ResultSearchSteps resultSearchSteps = new ResultSearchSteps();
    YandexSteps yandexSteps = new YandexSteps();
    ResultSearchPage resultSearchPage = new ResultSearchPage();
    String  input = null;
    String output= null;

    @When("^выбран пункт меню - \"(.+)\"$")
    public void SelectMarketSection(String menuItem) {
        yandexSteps.stepSelectMarketSection(menuItem);
    }

    @When("^закртытие вкладки Яндекс и переход во вкладку Маркет")
    public void WindowsHandlesManagment() {
        yandexSteps.stepWindowsHandlesManagment();
    }

    @When("^выбор пункта меню  - \"(.+)\"$")
    public void SelectElectonicSection(String menuitem) {
        marketSteps.stepSelectElectonicSection(menuitem);
    }

    @When("^переход в раздел Наушники и Bluetooth-гарнитуры")
    public void SelectHeadphonesSection() {
        electronicSteps.stepSelectHeadphonesSection();
    }

    @When("^переход в раздел Телевизоры")
    public void SelectTvSection() {
        electronicSteps.stepSelectTvSection();
    }


    @When("^нажимаем на кнопку Все фильтры")
    public void СheckoutButton() {
        productSteps.stepAllfiltersBtn();
    }

    @When("^поле \"(.+)\" заполняется значением - \"(.+)\"$")
    public void FillFields(String field, String value) {
        advancedSearchSteps.stepFillField(field, value);
    }

    @When("^активация чекбокса Beats")
    public void BeatsCheckbox() {
        advancedSearchSteps.stepBeatsCheckbox();
    }

    @When("^активация чекбокса LG")
    public void LgCheckbox() {
        advancedSearchSteps.stepLgCheckbox();
    }

    @When("^активация чекбокса Samsung")
    public void SamsungCheckbo() {
        advancedSearchSteps.stepSamsungCheckbox();
    }

    @When("^нажатие на кнопку Показать")
    public void ShowButton() {
        advancedSearchSteps.stepShowButton();
    }

    @When("^вывдено результатов поисковой выдачи на странице:  \"(.+)\"$")
    public void checkCountOfResultElements(int expectedCount) {
        resultSearchSteps.stepcheckCountOfResultElements(expectedCount);
    }

    @When("^запоминаем первое значение списка")
    public void getFirstelement() {
        input = resultSearchPage.getFirstElement().getText();
    }

    @When("^в поле поиска вводим запомненное значение")
    public void FillField() {
        resultSearchSteps.stepFillField("Поиск", input);
    }

    @When("^запоминаем первое элемент в поисковой выдаче")
    public void getFirstElementOfSearch() {
         output = resultSearchPage.searchInput.getAttribute("value");
    }

    @When("^наименование товара соответствует запомненному значению")
    public void CheckFillField() {
        resultSearchSteps.stepCheckFillField("Первый элемент поиска", output);
    }
}
