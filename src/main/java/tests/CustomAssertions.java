package tests;

import org.testng.Assert;

public class CustomAssertions extends Assert {

    public static void isTitleEquals(String expectedTitle, String actualTitle) {
        String errorMessage = "Title is not matching. GOT: " + actualTitle + " | EXPECTED: " + expectedTitle;
        Assert.assertEquals(actualTitle, expectedTitle, errorMessage);
    }

    public static void isTextEquals(String expectedText, String actualText) {
        String errorMessage = "Text is not matching. GOT: " + actualText + " | EXPECTED: " + expectedText;
        Assert.assertEquals(actualText, expectedText, errorMessage);
    }

    public static void textContains(String extractedText, String fullText) {
        String errorMessage = extractedText + " was not found in this text: " + fullText;
        assertTrue(fullText.contains(extractedText), errorMessage);
    }

    public static void isElementDisplayed(Boolean webElementDisplayed, String title) {
        String errorMessage = "Element is not displayed in the page: " + title;
        Assert.assertTrue(webElementDisplayed, errorMessage);
    }
}
