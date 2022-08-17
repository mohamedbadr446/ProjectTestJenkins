package Execution;

import org.testng.annotations.Test;

import Global.Connexion;
import Pages.LoginPage;
import Pages.PagnePage;
import Pages.ShopePage;

public class ExShop extends Connexion {



	@Test
	public void run() {
		
		ShopePage shopePage=new ShopePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		PagnePage pagnePage=new PagnePage(driver);
		
		loginPage.clickMyaccount();
		loginPage.insertLoginEmail(email_Reg);
		loginPage.insertLoginPwd(password);
		loginPage.clickButtonLogin();
		loginPage.verfierPageLogin();
		
		shopePage.clickShop();
		shopePage.verifierPageHome();
		shopePage.clickProduit();
		shopePage.clickAddToBasket();
		
		pagnePage.clickPagnier();
		pagnePage.verifierProduit();
		pagnePage.supprimerProduit();
	}
}
