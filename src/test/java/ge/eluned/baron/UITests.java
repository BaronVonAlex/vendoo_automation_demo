package ge.eluned.baron;

import ge.eluned.baron.config.ConfigTests;
import ge.eluned.baron.steps.common.CommonSteps;
import ge.eluned.baron.steps.common.HeaderSectionSteps;
import ge.eluned.baron.steps.common.HelperSteps;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static ge.eluned.baron.data.constants.Constants.SEARCH_KEYWORD_1;
import static ge.eluned.baron.data.constants.ExpectedValues.*;

@Epic("User Interface Tests")
public class UITests extends ConfigTests {

    protected static HeaderSectionSteps headerSectionSteps;
    protected static CommonSteps commonSteps;
    protected static HelperSteps helperSteps;

    @BeforeClass
    public void setUp() {
        headerSectionSteps = new HeaderSectionSteps();
        commonSteps = new CommonSteps();
        helperSteps = new HelperSteps();
        commonSteps.openWebsite();
    }

    @Severity(SeverityLevel.MINOR)
    @Story("Header UI Elements")
    @Feature("Header Elements")
    @Description("Validate if main elements exist and they function.")
    @Test(description = "Validate UI elements on header", priority = 1)
    public void headerUi() {
        helperSteps.removeVendooRecommendationDiv();
        headerSectionSteps
                .validateVendooLogo(VENDOO_LOGO_SRC_EXPECTED_VALUE)
                .validateIfHeaderTextIsCorrect(HEADER_EXPECTED_TXT_VALUE)
                .validateSearchbarPlaceholderText(SEARCH_BAR_SRC_EXPECTED_VALUE)
                .clickOnSearchBar()
                .validateIfSuggestionsShowUpAfterClickingOnSearchBar()
                .clickOnSearchBar()
                .writeTextInSearchbar(SEARCH_KEYWORD_1)
                .validateIfSuggestionsAreRelatedToSearchKeyword(SEARCH_KEYWORD_1);
    }
}
