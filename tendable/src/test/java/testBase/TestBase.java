package testBase;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import pageFactory.ContactPage;
import pageFactory.HomePage;

public class TestBase {
	public static WebDriver driver;
	public static String browser;
	public static Properties prop;
	public static SoftAssert st;
	
	public static HomePage hp;
	public static ContactPage cp;

	public void openBrowser() throws Throwable, Throwable {
		st = new SoftAssert();

		prop = new Properties();
		prop.load(new FileReader("src\\test\\resources\\config.properties"));
		browser = prop.getProperty("bb");

		System.out.println("browser = " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("ff")) {
			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		initClass();
	}

	public void closeBrowser() {

		driver.quit();

	}

	public void initClass() {
		
		hp = PageFactory.initElements(driver, HomePage.class);
		cp = PageFactory.initElements(driver, ContactPage.class);
		
	}

}
