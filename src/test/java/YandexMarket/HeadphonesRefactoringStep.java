package YandexMarket;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.*;
import org.junit.Test;

public class HeadphonesRefactoringStep extends BaseStep {

    YandexPage yandexPage = new YandexPage();
    MarketPage marketPage = new MarketPage();
    ElectronicPage electronicPage = new ElectronicPage();
    ProductPage productPage = new ProductPage();
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @Test
    public void newMarketRefactoringTest() {

        driver.get(baseurl);

        yandexPage.selectmarketSection("Маркет");
        yandexPage.windowsHandlesManagment();

        marketPage.selectElectonicSection("Электроника");

        electronicPage.HeadphonesSection.click();

        productPage.AllfiltersBtn.click();

        advancedSearchPage.fillField("Цена", "5000");
        advancedSearchPage.BeatsCheckbox.click();
        advancedSearchPage.ShowButton.click();

        resultSearchPage.checkCountOfResultElements(19);

        resultSearchPage.fillField("Поиск", resultSearchPage.getFirstElement().getText());
        resultSearchPage.checkFillField("Первый элемент поиска", resultSearchPage.searchInput.getAttribute("value"));
    }
}
