package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GoogleTest {
    @Test
    public void googleTest() throws IOException, InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com");
//        System.out.println("Current Page url==> "+driver.getCurrentUrl());
//        driver.close();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("URL");
//        WebElement username=driver.findElement(By.xpath(""));
//        WebElement password=driver.findElement(By.xpath(""));


        Properties props=new Properties();
        props.load(GoogleTest.class.getClassLoader().getResourceAsStream("Myproject.properties"));
        String uName=props.getProperty("uName");
        String Pwd=props.getProperty("Pwd");
        System.out.println("Username value is => "+ uName);
        System.out.println("Username value is => "+ Pwd);
          System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("*******************************************");
         System.out.println("*       This is master branch            *");
         System.out.println("*******************************************"); 
          System.out.println("");
        System.out.println("");
        System.out.println("");
//        username.sendKeys(UName);//AgentHunt
//        password.sendKeys(Pwd);//MissionImpossible
    }
}
