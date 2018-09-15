package skeleton.com.seleniumFunction;
import org.openqa.selenium.WebDriver;

public class BrowserDriver
{
	public  WebDriver driver = null;
	/*
	 *  设置driver
	 */
	 public  void setDriver (WebDriver driver){
		this.driver = driver;
	}
	
   /*
    * 得到driver
    */
	 public  WebDriver getDriver (){
		return this.driver ;
	}
	
	/*
	 * 访问网页
	 */
	public  void  goToUrl(String url){
		this.driver.navigate().to(url);
	}
	
	public  void quitDriver(){
		this.driver.quit();
	}
	

}
