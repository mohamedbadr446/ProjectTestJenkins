package Global;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Connexion {

	public static WebDriver driver;
	public static String url = "https://practice.automationtesting.in/";

	public static String email_Reg = "mohamedbadreamine@gmail.com";

	public static String password = "BADRE@amine97";

	static ExtentReports report;
	static ExtentTest test;

	@BeforeTest
	public void getConnexion() {
		report = new ExtentReports(System.getProperty("user.dir") + "\\target\\ExtentReport.html");
		test=report.startTest("test1");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mohamine\\eclipse-workspace\\FOne\\src\\test\\java\\Ressources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void screen() {
		try {
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver);

			ImageIO.write(screenshot.getImage(), "jpg",
					new File("C:\\Users\\mohamine\\eclipse-workspace\\FOne\\target\\ElementScreenshot.jpg"));
			test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\mohamine\\eclipse-workspace\\FOne\\target\\ElementScreenshot.jpg"));
			report.endTest(test);
			report.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void fermer() {
		screen();
		driver.close();
	}

}
