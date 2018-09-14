1.命令行运行case
mvn clean test

2. 运行的case范围
通过设置如下命令，确认
@CucumberOptions(plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"}, features = "src/test/resources/skeleton/")
public class RunCukesTest extends AbstractTestNGCucumberTests {
}
