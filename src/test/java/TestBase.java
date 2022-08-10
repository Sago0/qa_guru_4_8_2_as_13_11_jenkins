import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "2560x1440";
//        Configuration.browser = System.getProperty("browser", "chrome");
        addListener("AllureSelenide", new AllureSelenide());
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";
    }
}
