package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.StepDefinitions.StartClass.driver;
import static org.example.StepDefinitions.StartClass.user;
import static org.junit.Assert.assertTrue;

public class AddNewUserSteps {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
    }

    @When("user enter a valid credentials")
    public void iEnterValidCredentials() {
        user.usernameField().sendKeys("Admin");
        user.passwordField().sendKeys("admin123");
        user.loginButton().click();
    }

    @Then("user should be redirected to the dashboard page")
    public void iShouldBeRedirectedToTheForgotPasswordPage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.oxd-layout div.oxd-layout-container div.oxd-layout-context div.oxd-grid-3.orangehrm-dashboard-grid div.oxd-grid-item.oxd-grid-item--gutters.orangehrm-dashboard-widget:nth-child(1) div.oxd-sheet.oxd-sheet--rounded.oxd-sheet--white.orangehrm-dashboard-widget > div.orangehrm-dashboard-widget-header")));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }

    @And("scroll down")
    public void scrollDown() {
        // Create a JavascriptExecutor object by casting the WebDriver instance
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        // Scroll down to the element
        scrollDown.executeScript("arguments[0].scrollIntoView(true);", user.EmployeeDistributionByLocationDiagram());
    }

    @And("check the diagram appears")
    public void checkTheDiagramAppears() {
        assertTrue(user.EmployeeDistributionByLocationDiagram().isDisplayed());
    }

    @And("user click on the admin tab")
    public void userClickOnTheAdminTab() {
        user.adminTab().click();
    }

    @Then("the user should be redirected to the System Users page")
    public void theUserShouldBeRedirectedToTheSystemUsersPage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-table-filter")));
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
    }

    @And("click on the add new admin")
    public void clickOnTheAddNewAdmin() {
        user.addNewUserButton().click();
    }

    @And("select user role")
    public void selectUserRole() {
      Select select = new Select(user.userRoleDropDownList());
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       select.selectByVisibleText("Admin");
//      user.list().click();
    }

    @And("add employee name")
    public void addEmployeeName() {
        user.employeeNameField().sendKeys("Orange  Test");
    }

    @And("select the status")
    public void selectTheStatus() {
        Select select = new Select(user.statusDropDownList());
        select.selectByIndex(0);
    }

    @And("add username")
    public void addUsername() {
        user.usernameForNewAdminField().sendKeys("Ahmed");
    }

    @And("add password")
    public void addPassword() {
        user.passwordForNewAdminField().sendKeys("admin123");
    }

    @And("add confirm password")
    public void addConfirmPassword() {
        user.confirmPasswordField().sendKeys("admin123");
    }

    @And("click on the save button")
    public void clickOnTheSaveButton() {
        user.saveButton().click();
    }

    @Then("the user should added")
    public void theUserShouldAdded() {
        user.searchUserNameFiled().sendKeys("Ahmed");
        user.searchButton().click();
        assertTrue(user.usernameRow().isDisplayed());
    }

    @Then("search for the added user by username")
    public void searchForTheAddedUserByUsername() {
        user.searchUserNameFiled().sendKeys("Ahmed");
        user.searchButton().click();
    }

    @And("click on the delete user")
    public void clickOnTheDeleteUser() {
        user.deleteButton().click();
    }

    @And("click on the confirm")
    public void clickOnTheConfirm() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}