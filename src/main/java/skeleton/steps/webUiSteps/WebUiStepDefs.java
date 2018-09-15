package skeleton.steps.webUiSteps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import skeleton.com.seleniumFunction.BrowserDriver;
import skeleton.com.seleniumFunction.Element;

public class WebUiStepDefs {
    WebDriver driver = new ChromeDriver();
    BrowserDriver browserDriver  = new BrowserDriver();

    @Then("^打开谷歌浏览器$")
    public void open_browser() {
        System.out.print("\n++++++++++++打开谷歌浏览器");
        browserDriver.setDriver(driver);
        browserDriver.goToUrl("https://www.baidu.com");
        Element el = new Element(driver, "xpath;//input[@id='su']");
        el.wait_element_present();
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Then("^关闭谷歌浏览器$")
    public void close_browser() {
        browserDriver.goToUrl("https://www.sina.com.cn");
        browserDriver.quitDriver();
    }


}
