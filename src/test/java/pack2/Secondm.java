package pack2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Secondm {
	public static void main(String[] args) throws InterruptedException {
		String path = "C:\\Users\\admin\\eclipse-workspace_javapro\\YZX\\driver_c\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://mvnrepository.com/");
		//locatable methods 
		//WebElement Element = driver.findElement(By.id(""));
		//WebElement Element2 = driver.findElement(By.className(""));
		//WebElement Element3 = driver.findElement(By.name(""));
		//WebElement Element4 = driver.findElement(By.linkText(""));
		//WebElement Element5 = driver.findElement(By.partialLinkText(""));
		//WebElement Element6 = driver.findElement(By.tagName(""));
		////WebElement Element7 = driver.findElement(By.xpath(""));
		//WebElement Element8 = driver.findElement(By.cssSelector(""));
		//List<WebElement>Elements = driver.findElements(By.id(""));
		//Drop down
		Select dd=new Select(driver.findElement(By.id("xyz")));
		dd.selectByIndex(1);
		dd.selectByValue("Albania");
		dd.deselectByVisibleText("Algeria");
      // validation methods
		//boolean res=driver.findElement(By.xpath("ghhh")).isDisplayed();
		//driver.findElement(By.xpath("ghhh")).isEnabled();
		// driver.findElement(By.xpath("ghhh")).isSelected();
      // capture data methods 
		//String text=driver.findElement(By.id("xyz")).getText();
		//  String Attr=driver.findElement(By.id("xyz")).getAttribute("name");
       //Synchronization methods
       //unconditional wait - blind wait
       Thread.sleep(3000);
       //condtional wait - implicit  wait & explicit wait & fluent wait
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.close();
}
}


