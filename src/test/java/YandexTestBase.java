import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class YandexTestBase {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "2560x1440";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.baseUrl = "https://yandex.by/";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}