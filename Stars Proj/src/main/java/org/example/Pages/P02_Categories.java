package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Categories
{
    public P02_Categories(){PageFactory.initElements(Hooks.driver, this);}

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[1]/input")
    public WebElement Email;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[2]/input")
    public WebElement Password;
    @FindBy(xpath = "/html/body/main/div[2]/div/div/div/div[2]/form/div[4]/button")
    public WebElement SignIn;

    @FindBy (xpath = "/html/body/aside/div[2]/ul/li[2]/a")
    public WebElement CategoriesLink;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/div/div[1]/p/a/button")
    public WebElement AddButton;
    @FindBy(css= "#name_ar")
    public WebElement NameAr;

    @FindBy(css = "#name_en")
    public WebElement NameEn;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div/button")
    public WebElement SaveBtn;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/a/button/span[2]")
    public WebElement EditBtn;


    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/input[1]")
    public WebElement NameArBtn;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div/button")
    public WebElement SaveButton;


}
