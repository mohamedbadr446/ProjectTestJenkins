package Execution;

import org.testng.annotations.Test;

import Global.Connexion;
import Pages.LoginRegisterSucc;

public class ExRegister extends Connexion{

	String email_Reg = "mohamedbadreamine@gmail.com";
	String password = "BADRE@amine97";

	@Test
	public void runRegister() {

		LoginRegisterSucc loginRegister = new LoginRegisterSucc(driver);

		loginRegister.clickMyaccount();
		loginRegister.insertRegisterEmail(email_Reg);
		loginRegister.clickZoneRegister();
		loginRegister.clickZoneRegister();
//		Cette action ne se passe pas qu'après une action du double click
		loginRegister.insertRegisterPwd(password);
		loginRegister.verfierPwdSucc();
		loginRegister.clickButtonRegister();
//		loginRegister.verfierPageReg();

	}


}
