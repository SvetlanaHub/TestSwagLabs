package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WebEventListener implements WebDriverEventListener {

    private static final Logger logger = LogManager.getLogger(WebEventListener.class);

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        logger.info("Navigating to: '" + url + "'");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        logger.info("Navigated to:'" + url + "'");
    }

    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        logger.info("Entering value" + element.toString()
                + "in the field input");

    }

    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        logger.info("Element value changed to: " + element.toString());

    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        logger.info("Clicking on button: " + element.toString());

    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        logger.info("Clicked on: " + element.toString());

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Navigating back to previous page");
    }

    public void afterNavigateBack(WebDriver driver) {
        System.out.println("Navigated back to previous page");
    }

    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Navigating forward to next page");
    }

    public void afterNavigateForward(WebDriver driver) {
        System.out.println("Navigated forward to next page");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void onException(Throwable error, WebDriver driver) {
        System.out.println("Exception occured: " + error);
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Trying to find Element By : " + by.toString());
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Found Element By : " + by.toString());
    }

    /*
     * non overridden methods of WebListener class
     */
    public void beforeScript(String script, WebDriver driver) {
    }

    public void afterScript(String script, WebDriver driver) {
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

}




