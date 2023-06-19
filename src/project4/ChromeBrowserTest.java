package project4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.saucedemo.com/";


        // Set up the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(baseUrl);

        //Print the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is" + title);

        // Print the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Print Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email Field Element
        WebElement userNameField = driver.findElement(By.id("user-name"));

        //Type the email address to the email field element
        userNameField.sendKeys("khushi123");


        //Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.id("password"));


        //Action is to Type the password .
        passwordField.sendKeys("Khushi221@");


        //Close The Browser
        driver.close();


    }
}
