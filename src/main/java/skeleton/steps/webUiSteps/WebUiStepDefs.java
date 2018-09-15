package skeleton.steps.webUiSteps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import skeleton.com.seleniumFunction.Driver;
import skeleton.com.seleniumFunction.Element;

public class WebUiStepDefs {
    @Then("^打开谷歌浏览器$")
    public void open_browser() {
        System.out.print("\n++++++++++++打开谷歌浏览器");
        WebDriver driver = new ChromeDriver();
        Driver.set_driver(driver);
        Driver.go_to_url("https://www.baidu.com");
        Element el = new Element("xpath;//input[@id='su']");
        el.wait_element_present();
        System.out.println("Page title is: " + driver.getTitle());
    }
}
