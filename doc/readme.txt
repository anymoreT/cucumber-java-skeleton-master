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

7.依赖注入的时候，主要在在一个stepDefs上加入
@ContextConfiguration(classes = {TestConfiguration.class})

8. mvn test -Dcucumber.options="-g step_definitions features
mvn test -Dcucumber.options="-g  skeleton.steps  -f src/test/resources/skeleton/features/webFeature"
mvn clean test -Dcucumber.options =“ -  tags @search --monochrome --plugin pretty ：STDOUT --plugin html：target / cucumber-html-report --plugin json：target / cucumber.json --glue steps --glue runsupport classpath：features“
mvn clean test -Dcucumber.options="-g  skeleton.steps  src/test/resources/skeleton/features/webFeature"
mvn clean test -Dcucumber.options="-g  skeleton.steps  --tags @id1"

unning skeleton.runner.RunTestFeatureSuitTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@7b3300e5

====执行case前跑Usage: java cucumber.api.cli.Main [options] [[[FILE|DIR][:LINE[:LINE]*] ]+ | @FILE ]

Options:

  -g, --glue PATH                        Where glue code (step definitions, hooks
                                         and plugins) are loaded from.
  -p, --[add-]plugin PLUGIN[:PATH_OR_URL]
                                         Register a plugin.
                                         Built-in formatter PLUGIN types: junit,
                                         html, pretty, progress, json, usage, rerun,
                                         testng. Built-in summary PLUGIN types:
                                         default_summary, null_summary. PLUGIN can
                                         also be a fully qualified class name, allowing
                                         registration of 3rd party plugins.
                                         --add-plugin does not clobber plugins of that
                                         type defined from a different source.
  -t, --tags TAG_EXPRESSION              Only run scenarios tagged with tags matching
                                         TAG_EXPRESSION.
  -n, --name REGEXP                      Only run scenarios whose names match REGEXP.
  -d, --[no-]dry-run                    Skip execution of glue code.
  -m, --[no-]monochrome                 Don't colour terminal output.
  -s, --[no-]strict                     Treat undefined and pending steps as errors.
      --snippets [underscore|camelcase]  Naming convention for generated snippets.
                                         Defaults to underscore.
  -v, --version                          Print version.
  -h, --help                             You're looking at it.
  --i18n LANG                            List keywords for in a particular language
                                         Run with "--i18n help" to see all languages
  --junit,OPTION[,OPTION]*               Pass the OPTION(s) to the JUnit module.
                                         Use --junit,-h or --junit,--help to print the
                                         options of the JUnit module.

Feature path examples:
  <path>                                 Load the files with the extension ".feature"
                                         for the directory <path>
                                         and its sub directories.
  <path>/<name>.feature                  Load the feature file <path>/<name>.feature
                                         from the file system.
  classpath:<path>/<name>.feature        Load the feature file <path>/<name>.feature
                                         from the classpath.
  <path>/<name>.feature:3:9              Load the scenarios on line 3 and line 9 in
                                         the file <path>/<name>.feature.
  @<path>/<file>                         Parse <path>/<file> for feature paths generated
                                         by the rerun formatter.

9. 获取帮助
mvn test -Dcucumber.options="--help"





