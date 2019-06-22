/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helen
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Autotest {
/**
* @param args the command line arguments
*/
public static void main(String[] args) throws InterruptedException {
// Create a new instance of the Firefox driver
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
WebDriver driver;
driver = new FirefoxDriver();
//Launch the some site
driver.get("https://www.facebook.com");
// Print a Log In message to the screen
System.out.println("Successfully opened the website localhost");
String Title = driver.getTitle();
System.out.println("Page Title: "+Title);
String CurrentUrl = driver.getCurrentUrl();
String PageSource = driver.getPageSource();
System.out.println("URL: "+CurrentUrl);
System.out.println("Source Code: "+PageSource);

}
}
