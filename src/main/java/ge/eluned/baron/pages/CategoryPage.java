package ge.eluned.baron.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CategoryPage {
    public ElementsCollection
            mobileDevices = $$x("//div[@class='grid grid-cols-2 gap-x-5 mt-7 desktop:grid-cols-4']//div[@class='group relative min-h-[298px] w-[160px] overflow-y-hidden w-full cursor-pointer overflow-visible desktop:h-[315px] desktop:w-[190px]']"),
            discountItemPrices = $$x("//div[@class='mt-3 flex items-center gap-[6px]']//span[@class='text-nowrap font-tbcx-bold text-sm desktop:text-2sm']");

    public SelenideElement
            discountSpan = $x("//span[@class='bg-[#F93A3A] text-white hidden desktop:block font-tbcx-bold py-[2px] px-[5px] text-sm rounded-lg']"),
            discountBtn = $("#hasDiscount"),
            priceOption_1 = $x("//p[contains(text(), '0₾ - 100₾')]");
}
