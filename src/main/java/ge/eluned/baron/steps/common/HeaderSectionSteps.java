package ge.eluned.baron.steps.common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ge.eluned.baron.pages.common.HeaderSection;
import io.qameta.allure.Step;
import org.openqa.selenium.StaleElementReferenceException;

import static ge.eluned.baron.data.constants.Attributes.ATTRIBUTE_PLACEHOLDER;
import static ge.eluned.baron.data.constants.Attributes.ATTRIBUTE_SRC;

public class HeaderSectionSteps {
    HeaderSection headerSection = new HeaderSection();

    @Step("Validate if Vendoo Logo has appropriate Image - {0}")
    public HeaderSectionSteps validateVendooLogo(String expectedValue) {
        headerSection.vendooLogo.shouldHave(Condition.attribute(ATTRIBUTE_SRC, expectedValue));
        return this;
    }

    @Step("Validate if Header text contains desired value - {0}")
    public HeaderSectionSteps validateIfHeaderTextIsCorrect(String expectedValue) {
        headerSection.headerText.shouldHave(Condition.text(expectedValue));
        return this;
    }

    @Step("Validate if Search Bar has proper expected Value - {0}")
    public HeaderSectionSteps validateSearchbarPlaceholderText(String expectedValue) {
        headerSection.searchBar.shouldHave(Condition.attribute(ATTRIBUTE_PLACEHOLDER, expectedValue));
        return this;
    }

    @Step("Perform click on Search Bar")
    public HeaderSectionSteps clickOnSearchBar() {
        headerSection.searchBar.click();
        return this;
    }

    @Step("Validate if suggestion window pops up after pressing on Search Bar.")
    public HeaderSectionSteps validateIfSuggestionsShowUpAfterClickingOnSearchBar() {
        headerSection.searchBarSuggestionWindow.shouldBe(Condition.visible);
        return this;
    }

    @Step("Write search keyword in Search bar - {0}")
    public HeaderSectionSteps writeTextInSearchbar(String searchValue) {
        headerSection.searchBar.sendKeys(searchValue);
        return this;
    }

    @Step("Validate if Search Suggestions are Related to Search Keyword - {0}")
    public HeaderSectionSteps validateIfSuggestionsAreRelatedToSearchKeyword(String searchValue) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                ElementsCollection suggestions = headerSection.searchBarSuggestionElements(searchValue);
                for (SelenideElement suggestion : suggestions) {
                    suggestion.shouldHave(Condition.partialText(searchValue));
                }
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        return this;
    }
}
