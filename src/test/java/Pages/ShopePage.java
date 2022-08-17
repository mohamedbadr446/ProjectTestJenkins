package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopePage {
	
	public WebDriver driver;
	
	private By xpathShop=By.xpath("//a[contains(text(),'Shop')]");
	private By xpathHome=By.xpath("//h4[contains(text(),'Product')]");
	private By xpathProduit=By.xpath("//img[contains(@title,'Android Quick Start Guide')]");
	private By xpathAddToBasket=By.xpath("//button[contains(text(),'Add to basket')]");

	
	public ShopePage(WebDriver driver) {
		this.driver=driver;
	}



	public void clickShop()
	{

		WebDriverWait wait = new WebDriverWait(driver, 100);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(xpathShop)) != null) {
			driver.findElement(xpathShop).click();
		}
	}
	
	public void verifierPageHome()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpathHome));

	}
	
	public void clickProduit()
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(xpathProduit)) != null) {
			driver.findElement(xpathProduit).click();
		}
	}
	
	public void clickAddToBasket()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(xpathAddToBasket)) != null) {
			driver.findElement(xpathAddToBasket).click();
		}
	}
}
