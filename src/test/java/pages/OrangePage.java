package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangePage {

    public By usernameWE = By.xpath("//input[@name='username']");
    public By passwordWE = By.xpath("//input[@name = 'password']");
    public By loginButton = By.xpath("//button[@type= 'submit']");
    public By errorMessagge = By.xpath("//p[text() = 'Invalid credentials']");

    public void login(){


    }





}
