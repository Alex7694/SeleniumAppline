package YandexMarket.util;


import SberbankInsuarance.steps.BaseStep;
import gherkin.formatter.model.Result;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;


public class AllureReporter extends ru.yandex.qatools.allure.cucumberjvm.AllureReporter {


    @Override
    public void result(Result result) {
      if(result.getStatus().equals("failed")) {
          takeScreenShot();
      }
      super.result(result);
    }


    @Attachment(type = "image/png", value = "Скриншот при ошибке" )
    public byte[] takeScreenShot() {
        return ((TakesScreenshot) BaseStep.getDriver()).getScreenshotAs(OutputType.BYTES);
        }
    }
