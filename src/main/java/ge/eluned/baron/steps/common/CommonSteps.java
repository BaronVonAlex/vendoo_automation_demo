package ge.eluned.baron.steps.common;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static ge.eluned.baron.data.constants.Constants.VENDOO_URL;

public class CommonSteps {
    @Step("Open Vendoo website.")
    public CommonSteps openWebsite() {
        open(VENDOO_URL);
        return this;
    }
}
