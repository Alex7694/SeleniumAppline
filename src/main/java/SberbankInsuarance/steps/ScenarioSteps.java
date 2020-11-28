package SberbankInsuarance.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    CatalogSteps catalogSteps = new CatalogSteps();
    ProductSelectionSteps productSelectionSteps = new ProductSelectionSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();


    @When("^выбран пункт меню \"(.+)\"$")
    public void SelectMainMenu(String menuItem) {
        mainSteps.stepSelectMainMenu(menuItem);
    }

    @When("^выполнено нажатие на - \"(.+)\"$")
    public void SelectTypeInsuarance(String menuItem) {
        mainSteps.stepSelectSubMenu(menuItem);
    }


    @When("^ожидание загрузки и проверка заголовка - \"(.+)\"$")
    public void CheckPageTitle(String menuitem) {
        catalogSteps.stepWaitSendAppClickable(BaseStep.getDriver());
        catalogSteps.checkPageTitle(menuitem);
    }

    @When("^нажатие на кнопку Оформить онлайн")
    public void SendAppButton() {
        catalogSteps.stepSendAppButton();
    }

    @When("^ожидание загрузки и нажатие на кнопку Оформить")
    public void СheckoutButton() {
       productSelectionSteps.waitSendApplickable(BaseStep.getDriver());
       productSelectionSteps.checkoutButton();
    }

    @When("^выбор гражданства")
    public void selectCitizenship() {
       registrationSteps.chooseCitizenship();
    }

    @When("^выбор пола")
    public void selectSex() {
        registrationSteps.chooseSex();
    }

    @When("^нажатие на кнопку Продолжить")
    public void continueButton() {
        registrationSteps.continueBtn();
    }

    @When("заполняются поля:")
    public void FillFields(DataTable fields) {
     fields.asMap(String.class, String.class).forEach(
             (key, value) -> registrationSteps.stepFillField(key, value));
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields){
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> registrationSteps.checkFillField(field, value));
    }

    @Then("^в поле \"(.+)\"присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String field, String errorMessage){
        registrationSteps.checkErrorMessageField(field, errorMessage);

    }
}
