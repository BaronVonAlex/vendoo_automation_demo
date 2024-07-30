package ge.eluned.baron.pages.common;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HeaderSection {
    public SelenideElement
            vendooLogo = $x("//img[@alt='Vendoo Logo']"),
            headerText = $("span[color=\"light\"]"),
            searchBar = $x("//form[@class='w-full']/input"),
            searchBarSuggestionWindow = $x("//div[@class='relative']"),
            promotionsBtn = $("img[alt=\"Vendoo Promotions\"]"),
            cartBtn = $("img[alt=\"Vendoo Card\"]"),
            authBtn = $("img[alt=\"Auth\"]"),
            tnetBtn = $("img[alt=\"tnet\"]"),
            tnetBtnDropdown = $("div[role=\"menu\"]"),
            tnetBtnDropdownHeaderTxt = $("h2[role=\"none\"]"),
            tnetBtnDropdownDescription = $("p[role=\"none\"]"),
            tnetBtnDropdownItems = $x("//div[@role='none']/a");

    public ElementsCollection
            searchBarSuggestionElements = $$x("//div[@class='relative']//a/p");
}
