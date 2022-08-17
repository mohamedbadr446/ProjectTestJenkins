package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginRegisterSucc {

	private WebDriver driver;

//	MyAcount
	private By MyAccount = By.xpath("//a[contains(text(),'My Account')]");
//	Register
	private By email_Register = By.xpath("//input[@id='reg_email']");
	private By pwd_Register = By.xpath("//input[@id='reg_password']");
	private By button_Register = By.xpath("//input[@name='register']");
	private By xpathZoneRegister = By.xpath("//p[@class='woocomerce-FormRow form-row']");
	private By xpathVerifierPwdSucc = By.xpath("//div[contains(text(),'Strong')]");
	private By xpathPageReg = By.xpath("//p[contains(text(),'Hello')]");

	public LoginRegisterSucc(WebDriver driver) {
		this.driver=driver;
	}

	public void clickMyaccount() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MyAccount));
		driver.findElement(MyAccount).click();
	}

	public void insertRegisterEmail(String email) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(email_Register)) != null) {
			driver.findElement(email_Register).sendKeys(email);
		}
	}

	public void insertRegisterPwd(String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(pwd_Register)) != null) {
			driver.findElement(pwd_Register).sendKeys(pwd);

		}
	}

	public void clickZoneRegister() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.elementToBeClickable(xpathZoneRegister)) != null) {
			driver.findElement(xpathZoneRegister).click();
		}

	}

	public void clickButtonRegister() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(button_Register)) != null) {
			driver.findElement(button_Register).click();
		}
	}

	public void verfierPwdSucc() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathVerifierPwdSucc));
		
	}

	public void verfierPageReg() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathPageReg));
			
	}

}
