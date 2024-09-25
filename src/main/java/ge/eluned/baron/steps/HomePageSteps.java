package ge.eluned.baron.steps;

import com.codeborne.selenide.ElementsCollection;
import ge.eluned.baron.pages.HomePage;
import ge.eluned.baron.pages.common.HeaderSection;
import io.qameta.allure.Step;

import java.util.List;

import static ge.eluned.baron.data.constants.Attributes.ATTRIBUTE_HREF;
import static ge.eluned.baron.data.constants.Constants.ITEM_LINK_SIZE_MISMATCH_ERR_MSG;
import static ge.eluned.baron.data.constants.Constants.UNEXPECTED_HREF_ERR_MSG;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageSteps {
    HeaderSection headerSection = new HeaderSection();
    HomePage homePage = new HomePage();

    @Step("Click on Promotions Button")
    public HomePageSteps clickOnPromotionsBtn() {
        headerSection.promotionsBtn.click();
        return this;
    }

    @Step
    public HomePageSteps clickOnChildLinksDropdownMenu() {
        headerSection.tnetBtn.click();
        return this;
    }

    @Step("Validate that all dropdown elements have correct hrefs")
    public HomePageSteps validateDropdownHrefs(List<String> expectedHrefs) {
        ElementsCollection hrefElements = homePage.tnetLinks;

        assertEquals(hrefElements.size(), expectedHrefs.size(), ITEM_LINK_SIZE_MISMATCH_ERR_MSG);

        hrefElements.forEach(element -> {
            String actualHref = element.getAttribute(ATTRIBUTE_HREF);
            boolean matches = expectedHrefs.stream().anyMatch(expectedHref -> expectedHref.equals(actualHref));
            assertTrue(matches, UNEXPECTED_HREF_ERR_MSG + actualHref);
        });

        return this;
    }
}
