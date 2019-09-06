package skeleton.steps.webUiSteps;
import gherkin.ast.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import skeleton.com.seleniumFunction.BrowserDriver;
import skeleton.com.seleniumFunction.Element;
import skeleton.config.TestConfiguration;
import skeleton.utils.DataRepo;


public class NormalStepDefs {

    @Autowired
    private DataRepo dataRepo;
    @Then("^打开网址:(.+)$")
    public void got_to_url(String url) {
    //    browserDriver.goToUrl(url);
        System.out.print("\n在另外一个case,version:" + dataRepo.getVersion());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\n+++++++++结束");
    }


}
