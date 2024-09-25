package ge.eluned.baron.steps;

import ge.eluned.baron.pages.PromotionsPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.WebDriverRunner.url;
import static ge.eluned.baron.data.constants.ExpectedValues.VENDOO_PROMOTIONS_PAGE_URL_EXPECTED_VALUE;
import static org.testng.Assert.assertEquals;

public class PromotionPageSteps {
    PromotionsPage promotionsPage = new PromotionsPage();

    @Step("Validate if Promotion Items are laoded")
    public PromotionPageSteps validatePromotionItems() {
        promotionsPage.itemDivs.shouldBe(visible);
        return this;
    }

    @Step("Validate if Promotions button took us to correct page.")
    public PromotionPageSteps validatePromotionsDestination() {
        assertEquals(VENDOO_PROMOTIONS_PAGE_URL_EXPECTED_VALUE, url());
        return this;
    }

    @Step("Go back to Home Page.")
    public PromotionPageSteps goBackToHomePage() {
        back();
        return this;
    }
}
