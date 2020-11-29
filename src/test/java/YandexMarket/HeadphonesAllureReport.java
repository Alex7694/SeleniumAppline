package YandexMarket;

import SberbankInsuarance.steps.BaseStep;
import YandexMarket.pages.ResultSearchPage;
import YandexMarket.steps.*;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;


public class HeadphonesAllureReport extends BaseStep {

    YandexSteps yandexSteps = new YandexSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    ProductSteps productSteps = new ProductSteps();
    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    ResultSearchSteps resultSearchSteps = new ResultSearchSteps();
    ResultSearchPage resultSearchPage = new ResultSearchPage();

    @Test
    @Title("Яндекс Маркет - Наушники")
    public void testMarketHeadphones() {

        driver.get(baseurl);

        yandexSteps.stepSelectMarketSection("Маркет");
        yandexSteps.stepWindowsHandlesManagment();

        marketSteps.stepSelectElectonicSection("Электроника");
        electronicSteps.stepSelectHeadphonesSection();

        productSteps.stepAllfiltersBtn();

        advancedSearchSteps.stepFillField("Цена", "5000");
        advancedSearchSteps.stepBeatsCheckbox();
        advancedSearchSteps.stepShowButton();

        resultSearchSteps.stepcheckCountOfResultElements(17);

        resultSearchSteps.stepFillField("Поиск", resultSearchPage.getFirstElement().getText());

        resultSearchSteps.stepCheckFillField("Первый элемент поиска", resultSearchPage.searchInput.getAttribute("value"));

    }
}
