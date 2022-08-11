package tests.properties;

import org.junit.jupiter.api.Test;

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
    void someTest4() {
        String resolution = System.getProperty("resolution", "2560x1440");
        String version = System.getProperty("version", "100");
        String browser = System.getProperty("browser", "chrome");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(resolution);
    }
}
