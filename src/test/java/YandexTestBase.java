import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class YandexTestBase {

    @BeforeAll
    static void setup() {
        Configuration.browserSize = "2560x1440";
        addListener("AllureSelenide", new AllureSelenide());
        Configuration.baseUrl = "https://yandex.by/";
    }
}
