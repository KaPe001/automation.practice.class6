package Testing;

import TestBase.TestBase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@Execution(ExecutionMode.CONCURRENT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WebsitesTesting extends TestBase {

    @ParameterizedTest
    @ValueSource(strings = {"Logowanie na koncie"})
    @Tag("Regression")
    @DisplayName("Sii Portal")
    @Order(1)
    public void goToSiiPortal(String expectedTitle) {
        driver.get("https://siiportal.sii.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @Tag("Regression")
    @DisplayName("onet.pl")
    @Order(2)
    public void goToOnetPl(String expectedTitle) {
        driver.get("https://onet.pl");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @Tag("Regression")
    @DisplayName("kotuszkowo.pl")
    @Order(3)
    public void goToKotuszkowoPl(String expectedTitle) {
        driver.get("http://kotuszkowo.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @Tag("Regression")
    @DisplayName("filmweb")
    @Order(4)
    public void goToFilmWeb(String expectedTitle) {
        driver.get("https://www.filmweb.pl/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("Regression")
    @DisplayName("Selenium documentation")
    @Order(5)
    public void goToSeleniumDocumentation(String expectedTitle) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
