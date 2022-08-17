package Execution;

import org.testng.annotations.Test;

import Global.Connexion;
import Pages.LoginPage;

public class ExLogin extends Connexion {
	
	@Test
	public void runLogin() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.clickMyaccount();
		loginPage.insertLoginEmail(email_Reg);
		loginPage.insertLoginPwd(password);
		loginPage.clickButtonLogin();
		loginPage.verfierPageLogin();
	}
}
