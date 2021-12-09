package TestBase;

import configuration.BrowserEnvironment;
import configuration.EnvironmentProperty;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    private static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void setDriver() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        logger.debug("WebDriver initialized");

    }

    @BeforeEach
    public void setUp() {
        driver = browserEnvironment.getDriver();
        logger.debug("Timeout");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
        logger.debug("WebDriver closed properly");
    }
}
