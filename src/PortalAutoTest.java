/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helen
 */
import com.google.common.base.Charsets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PortalAutoTest {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws InterruptedException, IOException { 
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
WebDriver driver;
driver = new FirefoxDriver();
String url=("https://portal.aait.edu.et/");
driver.get(url); 
System.out.println("Successfully opened the website localhost");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
WebElement id = driver.findElement(By.xpath("//input[@id='UserName']")); 
id.sendKeys("ate/5163/09"); 

WebElement password = driver.findElement(By.xpath("//input[@id='Password']")); 
WebDriverWait wait = new WebDriverWait(driver, 18); 
wait.until(ExpectedConditions.elementToBeClickable(password));
password.sendKeys("3147"); 
driver.findElement(By.className("btn-success")).click();

 driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();



String cont= driver.findElement(By.tagName("body")).getText();

try{
    FileWriter file= new FileWriter("Grade Report.doc");
    file.write(cont);
    file.close();
    
}
catch(IOException e){
    
} 
}
}
