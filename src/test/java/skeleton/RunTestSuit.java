package skeleton;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"},
        features = "src/test/resources/skeleton/",
        tags = { "@TestngScenario" }
          )
public class RunTestSuit extends AbstractTestNGCucumberTests {
        @BeforeSuite(alwaysRun = true)
        public void setUp() throws Exception {
            System.out.print("\n====执行case前跑");
        }

        @AfterSuite(alwaysRun = true)
        public void quit() {
            System.out.print("\n====执行case后跑");
        }

    }




