package skeleton.runner;


//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;


/*
通过tag指定跑的脚本
 */
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"},
        features = "src/test/resources/skeleton/features/webFeature",
        tags = { "@smoke" },
        glue="skeleton.steps"
          )
public class RunTestFeatureSuitTest extends AbstractTestNGCucumberTests {
        @BeforeSuite(alwaysRun = true)
        public void setUp() throws Exception {
            System.out.print("\n==+++++++++==执行case前跑");
        }

        @AfterSuite(alwaysRun = true)
        public void quit() {
            System.out.print("\n==--------------==执行case后跑");
        }

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    }




