package ge.eluned.baron.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public ElementsCollection tnetLinks = $$x("//div[@role='menu']//a[@target='_blank']");

    public SelenideElement
            technicButton = $x("//img[@alt='ტექნიკა']"),
            mobileDevicesBtnHover = $x("//span[contains(text(),'ტელეფონები')]");
}
