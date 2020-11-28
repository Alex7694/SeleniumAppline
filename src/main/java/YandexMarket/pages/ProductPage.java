package YandexMarket.pages;

import SberbankInsuarance.pages.BasePage;
import SberbankInsuarance.steps.BaseStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Все фильтры']")
    public WebElement AllfiltersBtn;

    public ProductPage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

}
