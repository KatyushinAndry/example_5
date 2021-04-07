package tests.Selenid;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.SearchFormPage;

public class SelenidSearchFormTest {

    SearchFormPage searchFormPage = new SearchFormPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Owner("a.katyushin")
    @Story("Menu Issue")
    @DisplayName("Check menu 'Issue' in repository")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "Checked URL", url = "https://github.com")
    @Test
    void SearchIssueTabTest() {
        searchFormPage
                .openPage()
                .fillSearchData()
                .openRepository()
                .checkIssueTab();
    }
}

