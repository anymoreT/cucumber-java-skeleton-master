package skeleton.steps.httpSteps;


import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import skeleton.com.seleniumFunction.BrowserDriver;
import skeleton.com.seleniumFunction.Element;
import org.springframework.beans.factory.annotation.Autowired;
import skeleton.config.TestConfiguration;
import org.springframework.test.context.ContextConfiguration;
import skeleton.utils.DataRepo;


public class HttpStepDefs {
    @Autowired
    private DataRepo dataRepo;

    @Then("^发送一个http请求$")
    public void send_http() {
        System.out.print("在 HttpStepDefs class,version:" + dataRepo.getVersion());
    }
}

