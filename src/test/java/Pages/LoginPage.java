package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public WebDriver driver;

//	MyAcount
	private By MyAccount = By.xpath("//a[contains(text(),'My Account')]");

//	Login
	private By username_Login = By.xpath("//input[@name='username']");
	private By pwd_Login = By.xpath("//input[@name='password']");
	private By button_Login = By.xpath("//input[@name='login']");
	private By xpathPageLogin = By.xpath("//p[contains(text(),'Hello')]");


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickMyaccount() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MyAccount));
		driver.findElement(MyAccount).click();
	}
	public void insertLoginEmail(String emailSucc) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(username_Login)) != null) {
			driver.findElement(username_Login).sendKeys(emailSucc);
		}
	}

	public void insertLoginPwd(String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(pwd_Login)) != null) {
			driver.findElement(pwd_Login).sendKeys(pwd);
		}
	}

	public void clickButtonLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(button_Login)) != null) {
			driver.findElement(button_Login).click();
		}
	}
	
	public void verfierPageLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathPageLogin));

		
	}

}
