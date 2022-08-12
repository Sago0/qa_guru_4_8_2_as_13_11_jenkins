package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//@Tag("some")
public class SystemPropertiesTests {
    @Test
    void someTest1() {
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
    }
    @Test
    void someTest2() {
        System.setProperty("browser", "opera");
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
    }
    @Test
    void someTest3() {
        System.setProperty("browser", "chrome");
        String version = System.getProperty("version", "100");
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
        System.out.println(version);
    }
    @Test
    @Tag("some4")
    void someTest4() {
        String browserSize = System.getProperty("browserSize", "2560x1440");
        String version = System.getProperty("version", "100");
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }
    @Test
    @Tag("some5")
    void someTest5() {
        String version = System.getProperty("version", "100");
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
        System.out.println(version);
    }
    @Test
    @Tag("some6")
    void someTest6() {
        String version = System.getProperty("version", "100");
        String browser = System.getProperty("browser");
        System.out.println(browser);
        System.out.println(version);
    }
}
