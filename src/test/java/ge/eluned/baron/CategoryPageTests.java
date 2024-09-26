package ge.eluned.baron;

import ge.eluned.baron.config.ConfigTests;
import ge.eluned.baron.steps.CategoryPageSteps;
import ge.eluned.baron.steps.HomePageSteps;
import ge.eluned.baron.steps.PromotionPageSteps;
import ge.eluned.baron.steps.common.CommonSteps;
import ge.eluned.baron.steps.common.HeaderSectionSteps;
import ge.eluned.baron.steps.common.HelperSteps;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CategoryPageTests extends ConfigTests {
    protected static HeaderSectionSteps headerSectionSteps;
    protected static CommonSteps commonSteps;
    protected static HelperSteps helperSteps;
    protected static HomePageSteps homePageSteps;
    protected static CategoryPageSteps categoryPageSteps;
    protected static PromotionPageSteps promotionPageSteps;

    @BeforeClass
    public void setUp() {
        headerSectionSteps = new HeaderSectionSteps();
        commonSteps = new CommonSteps();
        helperSteps = new HelperSteps();
        homePageSteps = new HomePageSteps();
        promotionPageSteps = new PromotionPageSteps();
        categoryPageSteps = new CategoryPageSteps();
        commonSteps.openWebsite();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Story("Category Page Tests")
    @Feature("Header Elements")
    @Description("Validate navigation to mobile devices, and functionality of discount, price range, brand, color, and sorting filters.")
    @Test(description = "Validate main UI elements on the Category Page.", priority = 1)
    public void filterTests() {
        helperSteps.removeVendooRecommendationDiv();
        homePageSteps
                .hoverOverTechnicButton()
                .clickOnMobileDevicesBtn();
        categoryPageSteps
                .clickOnPriceRange1()
                .validatePriceRange(0, 100);
    }
}
