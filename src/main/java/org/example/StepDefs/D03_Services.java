package org.example.StepDefs;

import io.cucumber.java.en.And;
import org.example.Pages.P03_Services;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class D03_Services {
    P03_Services services = new P03_Services();

    @And("user go to services page")
    public void userGoToServicesPage() {
        services.ServicesLink.click();
    }

    @And("user add new service")
    public void userAddNewService() {
        services.AddBtn.click();
    }

    @And("user NameAr and NameEn")
    public void userNameArAndNameEn() {
        services.NameAr.sendKeys("خدمة عملاء");
        services.NameEn.sendKeys("Customer Services");
    }

    @And("user enter BriefAr and BriefEn")
    public void userEnterBriefArAndBriefEn() {
        services.BriefAr.sendKeys("مختصر");
        services.BriefEn.sendKeys("Brief");
    }

    @And("user select Category")
    public void userSelectCategory() throws InterruptedException {
        Select Category = new Select(Hooks.driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/form/div/div[3]/div[1]/select")));
        Category.selectByValue("15");

    }

    @And("user save service")
    public void userSaveService() {
        services.SaveBtn.click();

    }
}
