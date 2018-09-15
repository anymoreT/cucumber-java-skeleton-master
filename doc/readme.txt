1.命令行运行case
mvn clean test

2. 运行的case范围
通过设置如下命令，确认
@CucumberOptions(plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"}, features = "src/test/resources/skeleton/")
public class RunCukesTest extends AbstractTestNGCucumberTests {
}

3. 通过tags来加标签

4.chrome driver
http://npm.taobao.org/mirrors/chromedriver/2.21/
 容易出现chrome不可以用，请重新启动下机器.需要设置环境变量： webdriver.chrome.driver：
 配对的 chrome和driver
 chrome: 69
 chromedriver: 2.41
 webdriver.chrome.driver:
 D:\huangyong\tools\chromeDriver\2.41\chromedriver_win32\chromedriver.exe
 D:\huangyong\tools\chromeDriver\2.41\chromedriver_win32\chromedriver.exe


5. idea plugin
http://plugins.jetbrains.com/plugin/9164-gherkin
http://plugins.jetbrains.com/plugin/7212-cucumber-for-java

6. 出现提示step没有被定义，确保在CucumberOptions里面的glue设置了正确的路径
@CucumberOptions(
        plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"},
        features = "src/test/resources/skeleton/features/webFeature",
        glue="skeleton.steps",
        tags = { "@TestngScenario" }
          )
