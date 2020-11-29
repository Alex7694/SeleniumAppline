package YandexMarket;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.*;
import org.junit.Ignore;
import org.junit.Test;

public class TvRefactoringStep extends BaseStep {

    YandexPage yandexPage = new YandexPage();
    MarketPage marketPage = new MarketPage();
    ProductPage productPage = new ProductPage();
    AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @Test
    public void newMarketRefactoringTest() {
        driver.get(baseurl);

        yandexPage.selectmarketSection("Маркет");
        yandexPage.windowsHandlesManagment();

        marketPage.selectElectonicSection("Электроника");

        ElectronicPage electronicPage = new ElectronicPage();
        electronicPage.TvSection.click();

        productPage.AllfiltersBtn.click();

        advancedSearchPage.fillField("Цена", "20000");
        advancedSearchPage.SamsungCheckbox.click();
        advancedSearchPage.LgCheckbox.click();
        advancedSearchPage.ShowButton.click();

        resultSearchPage.checkCountOfResultElements(48);
        resultSearchPage.fillField("Поиск", resultSearchPage.getFirstElement().getText());
        resultSearchPage.checkFillField("Первый элемент поиска", resultSearchPage.searchInput.getAttribute("value"));
    }
}
