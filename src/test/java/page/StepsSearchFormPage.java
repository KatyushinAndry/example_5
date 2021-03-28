package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static data.FakeData.baseUrl;
import static data.FakeData.searchRepository;

public class StepsSearchFormPage {

    @Step("Open main page")
    public StepsSearchFormPage openPage(){
        open(baseUrl);
        $(".HeaderMenu-link").shouldHave(text("Why GitHub?"));
        return this;
    }

    @Step("Search repository")
    public StepsSearchFormPage fillSearchData(){
        $(".header-search-input").setValue(searchRepository).pressEnter();
        return this;
    }

    @Step("Open repository")
    public StepsSearchFormPage openRepository(){
        $(By.linkText(searchRepository)).click();
        return this;
    }

    @Step("Check Issue tab")
    public void checkIssueTab(){
        $(withText("Issues")).click();
        $(".blankslate h3").shouldHave(text("Welcome to issues!"));
    }
}
