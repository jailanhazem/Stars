package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Services {
    public P03_Services(){PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/aside/div[2]/ul/li[3]/a")
    public WebElement ServicesLink;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/div/div[1]/p/a/button")
    public WebElement AddBtn;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[1]/div[1]/input")
    public WebElement NameAr;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[1]/div[2]/input")
    public WebElement NameEn;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[2]/div[1]/textarea")
    public WebElement BriefAr;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[2]/div[2]/textarea")
    public WebElement BriefEn;
    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[3]/div[1]/select/option[2]")
    public WebElement Category;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/div/form/div/div[6]/button")
    public WebElement SaveBtn;

}
