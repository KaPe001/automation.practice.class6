package Testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class NewLesson extends TestBase {
    private Logger logger = LoggerFactory.getLogger(NewLesson.class); //per class

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @Tag("Regression")
    @DisplayName("Selenium documentation")
    @Order(5)
    public void goToSeleniumDocumentation(String expectedTitle) {
        driver.get("https://www.selenium.dev/documentation/en/webdriver/");
        String actualTitle = driver.getTitle();
        logger.info("My actual title: " + actualTitle);
        logger.info("My expected title: {}", expectedTitle);
        logger.debug("My expected title: {}", expectedTitle);
//        logger.error("My expected title - error");
//        logger.warn("Warn message");
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
