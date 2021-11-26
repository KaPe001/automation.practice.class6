package Testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    WebDriver driver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        logger.debug("WebDriver initialized");
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.debug("Timeout");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
        logger.debug("WebDriver closed properly");
    }
}
