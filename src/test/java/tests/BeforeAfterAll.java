package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BeforeAfterAll {

    @BeforeAll
    public void setup() {

        Configuration.startMaximized = true;

    }

    @AfterAll
    public void tearDown() {

        closeWebDriver();

    }
}
