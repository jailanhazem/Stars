package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v117.webauthn.model.Ctap2Version;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.Callable;
import static org.example.StepDefs.Hooks.driver;

public class D02_Categories
{

    P02_Categories Categories = new P02_Categories();

    @Given("user enter credentials to login - {string}&{string}")
    public void userEnterCredentialsToLogin(String arg0, String arg1)
    {
        Categories.Email.sendKeys(arg0);
        Categories.Password.sendKeys((arg1));
    }

    @And("User click on sign in button")
    public void userClickOnSignInButton()
    {
        Categories.SignIn.click();
    }

    @Given("user go to categories page")
    public void user_go_to_categories_page() throws InterruptedException {
        Categories.CategoriesLink.click();

    }
    @And("user click on Add button")
    public void userClickOnAddButton()
    {
        Categories.AddButton.click();
    }

    @When("user enter Name Ar")
    public void userEnterNameAr() throws InterruptedException {

        Categories.NameAr.sendKeys("اختبار البرمجيات");

    }

    @And("user enter Name En")
    public void userEnterNameEn()
    {
        Categories.NameEn.sendKeys("QC");
    }


    @And("user select Role")
    public void userSelectRole()
    {
        Select objSelect =new Select(driver.findElement(By.id("role")));
        objSelect.selectByVisibleText("Project");
    }

    @And("user click save button")
    public void userClickSaveButton()
    {
        Categories.SaveBtn.click();
    }

    @Then("category added successfully")
    public void categoryAddedSuccessfully()
    {
        SoftAssert Assert = new SoftAssert();
        Assert.assertEquals(driver.findElement(By.cssSelector(".fl-success")),"Success");
        Assert.assertAll();


    }

    @And("user click on edit btn")
    public void userClickOnEditBtn()
    {
        Categories.EditBtn.click();
    }


    @And("user delete old data")
    public void userDeleteOldData()
    {
        Categories.NameArBtn.clear();
    }
    @And("User edit in NameAr input field")
    public void userEditInNameArInputField()
    {
        Categories.NameArBtn.sendKeys("اختبار البرمجيات");
    }

    @And("click save btn")
    public void clickSaveBtn()
    {
        Categories.SaveButton.click();
    }

}
