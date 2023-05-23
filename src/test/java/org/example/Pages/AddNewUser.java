package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefinitions.StartClass.driver;

public class AddNewUser {
    public WebElement usernameField() {
        return driver.findElement(By.name("username"));
    }

    public WebElement passwordField() {
        return driver.findElement(By.name("password"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.xpath
                ("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
    }

    public WebElement EmployeeDistributionByLocationDiagram() {
        return driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1)"));
    }

    public WebElement adminTab() {
        return driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Admin']"));
    }

    public WebElement addNewUserButton() {
        return driver.findElement(By.xpath("//button[normalize-space()='Add']"));
    }

    public WebElement userRoleDropDownList() {
//      return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]"));
//     return driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
        return driver.findElement(By.xpath("\"-- Select --\""));

    }

    public WebElement list(){
        return driver.findElement(By.className("oxd-select-wrapper"));
    }
    public WebElement employeeNameField() {
        return driver.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
    }

    public WebElement statusDropDownList() {
        return driver.findElement(By.xpath("//div[contains(text(),'Enabled')]"));
    }

    public WebElement usernameForNewAdminField() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]"));
    }

    public WebElement passwordForNewAdminField() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    }

    public WebElement confirmPasswordField() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]"));
    }

    public WebElement saveButton() {
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]"));
    }
public WebElement searchUserNameFiled(){
        return driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
    }

public WebElement searchButton(){
        return driver.findElement(By.cssSelector("button[type='submit']"));
}

    public WebElement usernameRow(){
        return driver.findElement(By.xpath("//div[contains(text(),'ahmed')]"));
    }

    public WebElement deleteButton(){
        return driver.findElement(By.cssSelector(".oxd-icon.bi-trash"));
    }

//    public WebElement searchButton(){
//        return driver.findElement(By.cssSelector("button[type='submit']"));
//    }
//
//    public WebElement searchButton(){
//        return driver.findElement(By.cssSelector("button[type='submit']"));
//    }
//
//    public WebElement searchButton(){
//        return driver.findElement(By.cssSelector("button[type='submit']"));
//    }

}
