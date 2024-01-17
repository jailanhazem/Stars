package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.example.Pages.P01_Login;

public class D01_Login
{
    P01_Login login = new P01_Login();

    @Given("user enter loginEmail")
    public void userEnterLoginEmail()
    {
        login.Email.sendKeys("admin@email.com");
    }
    @And("user enter password")
    public void userEnterPassword()
    {
        login.Password.sendKeys("123123");
    }

    @And("user select remember me")
     public void user_select_remember_me()
    {
        login.RememberMe.click();
    }

    @And("user click on sign in button")
    public void user_click_signIn_button()
    {
        login.SignIn.click();
    }


}
