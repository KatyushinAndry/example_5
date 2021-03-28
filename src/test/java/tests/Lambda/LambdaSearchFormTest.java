package tests.Lambda;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.SearchFormPage;

import static io.qameta.allure.Allure.step;

public class LambdaSearchFormTest {

    SearchFormPage searchFormPage=new SearchFormPage();

    @BeforeAll
    static void setup(){
        Configuration.startMaximized=true;
    }

    @Owner("a.katyushin")
    @Story("Menu Issue")
    @DisplayName("Check menu 'Issue' in repository")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name="BaseURL", url="https://github.com")
    @Test
    void SearchIssueTabTest(){

        step("Open main page", (step) -> {
            searchFormPage.openPage();
        });

        step("Search repository", (step) -> {
            searchFormPage.fillSearchData();
        });

        step("Open repository", (step) -> {
            searchFormPage.openRepository();
        });

        step("Check Issue tab", (step) -> {
            searchFormPage.checkIssueTab();
        });
    }
}
