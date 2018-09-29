package skeleton.runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.DataProvider;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
通过tag指定跑的脚本
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"},
        features = "src/test/resources/skeleton/features/webFeature",

        glue="skeleton.steps"
          )
public class RunTestFeatureSuit {
//        @BeforeSuite(alwaysRun = true)
//        public void setUp() throws Exception {
//            System.out.print("\n====执行case前跑");
//        }
//
//        @AfterSuite(alwaysRun = true)
//        public void quit() {
//            System.out.print("\n====执行case后跑");
//        }

//    @DataProvider(parallel = false)
//    @Override
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

    }




