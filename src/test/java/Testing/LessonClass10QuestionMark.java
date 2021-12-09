package Testing;

import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LessonClass10QuestionMark extends TestBase {

    @Test
    public void goToKotuszkowoPl() {
        String expectedTitle = System.getProperty("title");

        String actualTitle = driver.getTitle();
        assertThat(actualTitle, equalTo(expectedTitle));
    }
}
