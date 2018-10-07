package skeleton.runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/*
通过tag指定跑的脚本
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"},
        features = "src/test/resources/skeleton/features/webFeature",
        glue="skeleton.steps",
        tags = { "@TestngScenario" }
          )
public class RunTestTagsSuitTest {
        @BeforeSuite(alwaysRun = true)
        public void setUp() throws Exception {
            System.out.print("\n====wwwwwwwwwwww执行suit前跑");
        }

        @AfterSuite(alwaysRun = true)
        public void quit() {
            System.out.print("\n====wwwwwwwwwwww执行suit后跑");
        }

    }




