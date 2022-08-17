package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagnePage {

	public WebDriver driver;
	private By xpathProduit = By.xpath("//a[contains(text(),'Android Quick Start Guide')]");
	private By xpathPagnier= By.xpath("//a[contains(text(),'View Basket')]");
	private By xpathSuppProduit = By.xpath("//a[@title='Remove this item']");

	public PagnePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickPagnier() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(xpathPagnier)) != null) {
			driver.findElement(xpathPagnier).click();
		}
	}
	
	public void verifierProduit() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathProduit));
	}
	public void supprimerProduit() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(xpathSuppProduit)) != null) {
			driver.findElement(xpathSuppProduit).click();
		}
	}

}
