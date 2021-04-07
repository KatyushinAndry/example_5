package page;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static data.Data.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchFormPage {

    public SearchFormPage openPage() {
        open(baseUrl);
        $(".HeaderMenu-link").shouldHave(text("Why GitHub?"));
        return this;
    }

    public SearchFormPage fillSearchData() {
        $(".header-search-input").setValue(searchRepository).pressEnter();
        return this;
    }

    public SearchFormPage openRepository() {
        $(By.linkText(searchRepository)).click();
        return this;
    }

    public void checkIssueTab() {
        $(withText("Issues")).click();
        $(".blankslate h3").shouldHave(text("Welcome to issues!"));
    }
}
