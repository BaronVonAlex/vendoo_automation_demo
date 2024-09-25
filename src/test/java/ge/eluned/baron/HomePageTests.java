package ge.eluned.baron;

import ge.eluned.baron.config.ConfigTests;
import ge.eluned.baron.steps.HomePageSteps;
import ge.eluned.baron.steps.PromotionPageSteps;
import ge.eluned.baron.steps.common.CommonSteps;
import ge.eluned.baron.steps.common.HeaderSectionSteps;
import ge.eluned.baron.steps.common.HelperSteps;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static ge.eluned.baron.data.constants.ExpectedValues.expectedHrefs;

public class HomePageTests extends ConfigTests {
    protected static HeaderSectionSteps headerSectionSteps;
    protected static CommonSteps commonSteps;
    protected static HelperSteps helperSteps;
    protected static HomePageSteps homePageSteps;
    protected static PromotionPageSteps promotionPageSteps;

    @BeforeClass
    public void setUp() {
        headerSectionSteps = new HeaderSectionSteps();
        commonSteps = new CommonSteps();
        helperSteps = new HelperSteps();
        homePageSteps = new HomePageSteps();
        promotionPageSteps = new PromotionPageSteps();
        commonSteps.openWebsite();
    }

    @Severity(SeverityLevel.BLOCKER)
    @Story("Main Page Header Elements")
    @Feature("Header Elements functionality tests")
    @Description("Validate if main elements function properly")
    @Test(description = "Validate Header elements functionality", priority = 1)
    public void mainPageFunctionalTest() {
        helperSteps.removeVendooRecommendationDiv();
        homePageSteps
                .clickOnPromotionsBtn();
        promotionPageSteps
                .validatePromotionItems()
                .validatePromotionsDestination()
                .goBackToHomePage();
        homePageSteps
                .clickOnChildLinksDropdownMenu()
                .validateDropdownHrefs(expectedHrefs);
    }
}
