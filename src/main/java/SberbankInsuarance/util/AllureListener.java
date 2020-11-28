package SberbankInsuarance.util;

import SberbankInsuarance.steps.BaseStep;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class AllureListener extends ru.yandex.qatools.allure.junit.AllureRunListener {
    @Override
    public void testFailure(Failure failure) {
        takeScreenShot();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png", value = "Скриншот при ошибке" )
    public byte[] takeScreenShot() {
        return ((TakesScreenshot) BaseStep.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}