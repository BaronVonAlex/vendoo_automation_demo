package ge.eluned.baron.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class HomePage {
    public ElementsCollection tnetLinks = $$x("//div[@role='menu']//a[@target='_blank']");
}
