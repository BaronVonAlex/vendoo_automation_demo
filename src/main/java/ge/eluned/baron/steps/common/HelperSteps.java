package ge.eluned.baron.steps.common;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static ge.eluned.baron.data.jsscrips.JSScripts.REMOVE_DIALOG_ELEMENT_SCRIPT;

public class HelperSteps {
    @Step("Removes Vendoo Recommendation div.")
    public HelperSteps removeVendooRecommendationDiv() {
        executeJavaScript(REMOVE_DIALOG_ELEMENT_SCRIPT);
        return this;
    }
}
