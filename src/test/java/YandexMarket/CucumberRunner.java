package YandexMarket;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}, glue = {"SberbankInsuarance.steps"},
        plugin = {
                "YandexMarket.util.AllureReporter",
        }
)

public class CucumberRunner {
}