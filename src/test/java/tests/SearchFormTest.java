package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.SearchFormPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchFormTest {

    SearchFormPage registrationFormPage=new SearchFormPage();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized=true;
    }

    @Test
    void registrationFormTest() {
        registrationFormPage
                .openPage()
                .fillSearchData()
                .openRepository()
                .checkIssuePage();
    }
}
