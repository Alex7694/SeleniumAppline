package YandexMarket.pages;

import SberbankInsuarance.pages.BasePage;
import SberbankInsuarance.steps.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class YandexPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'services-new__list']")
    public WebElement MainMenu;


    public YandexPage() {
        PageFactory.initElements(BaseStep.getDriver(), this);
    }

    public void selectmarketSection(String menuItem) {
        MainMenu.findElement(By.xpath(".//div[text() = '" + menuItem + "']")).click();
    }

    public void windowsHandlesManagment() {
        ArrayList<String> windows = new ArrayList<String>(BaseStep.getDriver().getWindowHandles());
        BaseStep.getDriver().close();
        BaseStep.getDriver().switchTo().window(windows.get(1));
    }
}
