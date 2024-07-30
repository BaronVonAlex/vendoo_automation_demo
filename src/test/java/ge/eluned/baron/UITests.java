package ge.eluned.baron;

import ge.eluned.baron.config.ConfigTests;
import ge.eluned.baron.steps.common.CommonSteps;
import ge.eluned.baron.steps.common.HeaderSectionSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static ge.eluned.baron.data.constants.Constants.SEARCH_KEYWORD_1;
import static ge.eluned.baron.data.constants.ExpectedValues.*;


public class UITests extends ConfigTests {

    protected static HeaderSectionSteps headerSectionSteps;
    protected static CommonSteps commonSteps;

    @BeforeClass
    public void setUp() {
        headerSectionSteps = new HeaderSectionSteps();
        commonSteps = new CommonSteps();
        commonSteps.openWebsite();
    }

    @Test
    public void headerUi() {
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
