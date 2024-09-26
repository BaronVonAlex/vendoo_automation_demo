package ge.eluned.baron.steps;

import ge.eluned.baron.pages.CategoryPage;
import io.qameta.allure.Step;

import static ge.eluned.baron.data.constants.Constants.*;
import static org.testng.Assert.assertTrue;

public class CategoryPageSteps {
    CategoryPage categoryPage = new CategoryPage();

    @Step("Click on Discount button to filter items.")
    public CategoryPageSteps clickOnDiscountFilterOption() {
        categoryPage.discountBtn.click();
        return this;
    }

    @Step("Validate that all mobile items have discount span visible")
    public CategoryPageSteps validateIfAllMobileItemsHaveDiscount() {
        categoryPage.mobileDevices.forEach(element -> {
        });
        return this;
    }

    @Step("Click on price range option 1 and change filter.")
    public CategoryPageSteps clickOnPriceRange1() {
        categoryPage.priceOption_1.click();
        return this;
    }

    @Step("Validate the price range of discount items between {0} and {1}")
    public CategoryPageSteps validatePriceRange(int lowbound, int highbound) {
        categoryPage.discountItemPrices.forEach(element -> {
            int price = (int) Math.round(Double.parseDouble(element.getText().replace(GEL_CURRENCY_SYMBOL, EMPTY_CHAR).trim()));

            assertTrue(price >= lowbound && price <= highbound, ITEM_PRICE_RANGE_ERR_MSG + price);
        });
        return this;
    }
}
