package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class YandexTests extends TestBase {

    @Test
    void selenideSearchTest() {
        // Открыть yandex
        open("https://yandex.by/");
        // Ввести Selenide в поиск
        $("#text").setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
         $(".main__content").shouldHave(text("selenide.org"));
    }
}
