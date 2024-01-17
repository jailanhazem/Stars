package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Login
{
    public P01_Login() {PageFactory.initElements(Hooks.driver, this);}

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[1]/input")
    public WebElement Email;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[2]/input")
    public WebElement Password;

    @FindBy(xpath = "//*[@id=\"rememberMe\"]")
    public WebElement RememberMe;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[4]/button")
    public WebElement SignIn;
}
